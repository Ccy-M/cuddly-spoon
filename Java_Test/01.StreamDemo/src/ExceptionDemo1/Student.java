package ExceptionDemo1;

public class Student {



        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {

            if(age<18||age>60){
                throw new RuntimeException("年龄不合法");
            }else {            this.age = age;


            }

        }

        @Override
        public String toString() {
            return "Student2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


