package Builder;
public class Student {
    private final String fname;
    private final String lname;
    private final String email;
    private final String phone;
    private final String address;
    private Student(StudentBuilder builder){
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void displayMyStudent() {
        System.out.println("First Name : " + fname);
        System.out.println("Last Name  : " + lname);
        System.out.println("Email      : " + email);
        System.out.println("Phone      : " + phone);
        System.out.println("Address    : " + address);
    }

    // Static inner Builder class
    public static class StudentBuilder {
        private String fname;
        private String lname;
        private String email;
        private String phone;
        private String address;

        public StudentBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public StudentBuilder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        private boolean validate() {
            return fname != null && !fname.trim().isEmpty() && 
                   lname != null && !lname.trim().isEmpty();
        }

        public Student build() {
            if (!validate()) {
                throw new IllegalArgumentException("Invalid Student: First and Last name are required.");
            }
            return new Student(this);
        }
    }
}