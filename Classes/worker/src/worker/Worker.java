/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author PC
 */
public class Worker {

    private String name;
    private int ID;
    private int required_hours;
    private int hours_done;
    private int salary_per_hour;
    private boolean temporary_worker;

    public Worker(String name, int ID, int required_hours, int hours_done, int salary_per_hour, boolean temporary_worker) {
        this.name = name;
        this.ID = ID;
        this.required_hours = required_hours;
        this.hours_done = hours_done;
        this.salary_per_hour = salary_per_hour;
        this.temporary_worker = temporary_worker;
    }

    public Worker(String name, int ID, int salary_per_hour) {
        this.name = name;
        this.ID = ID;
        this.salary_per_hour = salary_per_hour;
    }

    public Worker() {
        this.name = "Israel Israeli";
        this.ID = 123456789;
        this.salary_per_hour = 27;
        this.temporary_worker = false;
    }

    public int get_salary() {
        if (!temporary_worker && is_loyal()) {
            this.salary_per_hour += 500;
        }
        return this.salary_per_hour;
    }

    public void worker_info() {
        System.out.println("name: " + this.name);
        System.out.println("ID: " + this.ID);
        System.out.println("required_hours: " + this.required_hours);
        System.out.println("hours_done: " + this.hours_done);
        System.out.println("salary_per_hour: " + this.salary_per_hour);
        System.out.println("Is temporary_worker? " + this.temporary_worker);
        int x = get_salary();
        System.out.println("salary: " + x);
        System.out.println(" ");
    }

    public boolean is_loyal() {
        if (hours_done >= required_hours) {
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker oved1 = new Worker("yosef", 339619876, 10, 12, 100, false);
        Worker oved2 = new Worker("chaim", 339619868, 120);
        Worker oved3 = new Worker();
        oved1.worker_info();
        oved2.worker_info();
        oved3.worker_info();

        int sum = oved1.get_salary() + oved2.get_salary() + oved3.get_salary();
        System.out.println("the 3 salaries together are: " + sum);
//        int y = oved1.get_salary();
//        System.out.println(y);
//        int x = oved2.get_salary();
//        System.out.println(x);
//        int z = oved3.get_salary();
//        System.out.println(z);
//there is aproblem with the sum of salaries

    }

}
