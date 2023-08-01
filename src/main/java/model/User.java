package model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    @JsonProperty("email")
    private String email;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("programs")
    private List<Program> programs;

//    @JsonProperty("control")
//    private Control control;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

//    public Control getControl() {
//        return control;
//    }
//
//    public void setControl(Control control) {
//        this.control = control;
//    }

    public static class Address {
        @JsonProperty("line1")
        private String line1;

        @JsonProperty("line2")
        private String line2;

        @JsonProperty("city")
        private String city;

        @JsonProperty("state")
        private String state;

        @JsonProperty("zip")
        private String zip;

        public Address() {
        }

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getLine2() {
            return line2;
        }

        public void setLine2(String line2) {
            this.line2 = line2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }

    public static class Program {
        @JsonProperty("name")
        private String name;

        @JsonProperty("eligibility")
        private boolean eligibility;

        @JsonProperty("date")
        private String date;

        @JsonProperty("attending")
        private boolean attending;

        public Program() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isEligibility() {
            return eligibility;
        }

        public void setEligibility(boolean eligibility) {
            this.eligibility = eligibility;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public boolean isAttending() {
            return attending;
        }

        public void setAttending(boolean attending) {
            this.attending = attending;
        }
    }

    public static class Control {
        @JsonProperty("active")
        private boolean active;

        public Control() {
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }
}

