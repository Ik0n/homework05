public class Sample01 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee();
        employees[1] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "lawyer", "ivanov@ivan.ru", "1-111-111-11-11", 50000, 25);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович",
                "Уборщик", "suprt@clean.ru", "2-222-222-22-22", 35000, 45);
        employees[3] = new Employee("Вовочкин", "Владимир", "Владимирович",
                "Писатель", "ааа@ууу.ru", "5-555-555-55-55", 22222, 50);
        employees[4] = new Employee("Казимиров", "Казимир", "Казимирович",
                "Артист", "qwe@qwe.qwe", "6-666-666-66-66", 66666, 66);

        for (Employee employee : employees) {
            if (employee.getAge() >= 40)
                employee.showInfo();
        }

    }

}


