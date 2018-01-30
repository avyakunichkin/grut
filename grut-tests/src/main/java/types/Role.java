package types;

public enum Role {

    USER("user"), ADMIN("admin"), SUPER("super");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
