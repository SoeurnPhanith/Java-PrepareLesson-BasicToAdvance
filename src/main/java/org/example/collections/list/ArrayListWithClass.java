package org.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithClass {
    public static void main(String[] args) {

        ArrayList<Students> studentList = new ArrayList<>();

        studentList.add(new Students(1, "Phanith", 20));

        for(int i=0; i<studentList.size(); i++){
            Students s = studentList.get(i);

            System.out.println("Id : " + s.id);
            System.out.println("Name : " + s.name);
            System.out.println("Age : " + s.age);
        }

        List<Students> stuList = new ArrayList<>(
                List.of(
                    new Students(1, "Phanith", 19),
                    new Students(2, "Heng Ass", 20),
                    new Students(3, "BirthDay Sex", 20)
                )
        );

        //get data
        System.out.println("=== All Students ===");
        for (Students s : stuList) {
            s.show();
        }
        //or
        System.out.println("------------------\n");
        for(int i=0; i<stuList.size(); i++){
            Students students = stuList.get(i);
            students.show();
        }

        //update
        int updateId = 1;

        for(int i = 0; i < stuList.size(); i++){
            if(stuList.get(i).id == updateId){

                // OLD object
                Students oldStu = stuList.get(i);

                // NEW object (copy old id but new values)
                Students newStu = new Students(
                        oldStu.id,   // keep id
                        "Soeurn Phanith Name",  // new name
                        20          // new age
                );

                // Replace index
                stuList.set(i, newStu);

                break;
            }
        }
        System.out.println("----------> After update : ");
        System.out.println("------------------\n");
        for(int i=0; i<stuList.size(); i++){
            Students students = stuList.get(i);
            students.show();
        }

    }


}
