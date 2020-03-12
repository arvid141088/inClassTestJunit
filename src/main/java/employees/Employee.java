package employees;

/**
 * Arvids Ceceruks
 * Group A
 * In class test 12/03/2020
 */

public class Employee {
    private String name;
    private String id;


    public Employee (String n, String i){
        setName(n);
        setId(i);
    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n.length()<5)
        {
            throw new IllegalArgumentException("Name must be 5 or more characters long");
        }
        else {
            this.name = n;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        if (i.length()==5){
            this.id = i;
        }
        else{
            throw new IllegalArgumentException("ID must be 5 characters");
        }
    }

}
