public class User {
    public String name;
    public float age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return name;}
    public float getAge(){return age;}

    public static void main(String[] args) {
        User anna = new User("Anna", 29);
        User pawel = new User("Paweł", 24);
        User paulina = new User("Paulina", 23);
        User grzegorz = new User("Grzegorz", 31);
        User kamila = new User("Kamila", 19);

        User[] users = new User[5];
        users[0] = anna;
        users[1] = pawel;
        users[2] = paulina;
        users[3] = grzegorz;
        users[4] = kamila;

            float sumAge = 0;
            for (int i = 0; i < users.length; i++) {
                sumAge = sumAge + users[i].age;
            }
            float AvgAge = sumAge / users.length;
        System.out.println(AvgAge);
             for (int i = 0; i < users.length; i++) {
                if (users[i].getAge() > AvgAge) {
                    continue;
                }
                System.out.println(users[i].getName());
            }
        }
    }


