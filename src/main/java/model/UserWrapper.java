package model;

import java.util.List;

public class UserWrapper {
    private List<User> users;
    private User.Control control;

    public UserWrapper() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User.Control getControl() {
        return control;
    }

    public void setControl(User.Control control) {
        this.control = control;
    }
}
