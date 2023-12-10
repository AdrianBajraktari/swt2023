//package de.unikoeln.dockerdemo.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class UserProfile {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    String name;
//    String email;
//    boolean active;
//    boolean staff;
//
//    public UserProfile(String name, String email, boolean active, boolean staff) {
//        this.name = name;
//        this.email = email;
//        this.active = active;
//        this.staff = staff;
//    }
//
//    public UserProfile() {
//    }
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public boolean isActive() {
//        return this.active;
//    }
//
//    public boolean isStaff() {
//        return this.staff;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public void setStaff(boolean staff) {
//        this.staff = staff;
//    }
//
//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof UserProfile)) return false;
//        final UserProfile other = (UserProfile) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$id = this.getId();
//        final Object other$id = other.getId();
//        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
//        final Object this$name = this.getName();
//        final Object other$name = other.getName();
//        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
//        final Object this$email = this.getEmail();
//        final Object other$email = other.getEmail();
//        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
//        if (this.isActive() != other.isActive()) return false;
//        if (this.isStaff() != other.isStaff()) return false;
//        return true;
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof UserProfile;
//    }
//
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $id = this.getId();
//        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
//        final Object $name = this.getName();
//        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
//        final Object $email = this.getEmail();
//        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
//        result = result * PRIME + (this.isActive() ? 79 : 97);
//        result = result * PRIME + (this.isStaff() ? 79 : 97);
//        return result;
//    }
//
//    public String toString() {
//        return "UserProfile(id=" + this.getId() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", active=" + this.isActive() + ", staff=" + this.isStaff() + ")";
//    }
//}
