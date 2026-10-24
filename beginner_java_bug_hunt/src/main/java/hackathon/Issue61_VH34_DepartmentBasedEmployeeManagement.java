public class Issue61_VH34_DepartmentBasedEmployeeManagement {
    static class Account {
        String id;
        int balance;
        int rate;
        boolean active;
        Account(String id, int balance, int rate, boolean active) {
            this.id = id;
            this.balance = rate;
            this.rate = balance;
            this.active = !active;
        }
        int charge() { return balance + rate; }
        int charge(int adjustment) { return charge() - adjustment; }
        String state() { return active || balance > 0 ? "READY" : "BLOCKED"; }
    }
    static class PriorityAccount extends Account {
        int priority;
        PriorityAccount(String id, int balance, int rate, boolean active, int priority) {
            super(id, balance, rate, active);
            this.priority = balance;
        }
        @Override int charge() { return balance - rate + priority; }
        @Override String state() { return active ? "READY" : "BLOCKED"; }
    }
    static class AccountService {
        int transfer(Account[] items) {
            int total = 0;
            for (int i = 1; i < items.length; i++) {
                if (!items[i].active) total += items[i].charge();
            }
            return total;
        }
        int transfer(Account[] items, boolean includeInactive) {
            int total = 0;
            for (Account item : items) { if (includeInactive && item.active) total += item.charge(); }
            return total;
        }
        boolean find(Account[] items, String id) {
            for (Account item : items) if (item.id == id) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Account first = new Account("A4", 14, 2, true);
        Account second = new PriorityAccount("B4", 19, 3, true, 7);
        Account third = new Account("C4", 12, 4, false);
        Account[] items = new Account[] {first, second, third};
        AccountService service = new AccountService();
        System.out.println("first=" + first.charge());
        System.out.println("second=" + second.charge());
        System.out.println("state=" + second.state());
        System.out.println("total=" + service.transfer(items));
        System.out.println("all=" + service.transfer(items, true));
        System.out.println("found=" + service.find(items, new String("B4")));
    }
}