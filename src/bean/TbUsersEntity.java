package bean;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: kuchi
 * Date: 2017/12/8
 * Time: 15:31
 */
@Entity
@Table(name = "tb_users", schema = "dingcan", catalog = "")
public class TbUsersEntity {
    private int id;
    private String workId;
    private String userName;
    private String password;
    private String trueName;
    private int roleId;
    private int departmentId;
    private String phoneNumber;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WorkId", nullable = true, length = 0)
    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    @Basic
    @Column(name = "UserName", nullable = true, length = 0)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = 0)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "TrueName", nullable = true, length = 0)
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Basic
    @Column(name = "RoleId", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "DepartmentId", nullable = false)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "PhoneNumber", nullable = true, length = 0)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUsersEntity that = (TbUsersEntity) o;
        return id == that.id &&
                roleId == that.roleId &&
                departmentId == that.departmentId &&
                Objects.equals(workId, that.workId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(trueName, that.trueName) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, workId, userName, password, trueName, roleId, departmentId, phoneNumber);
    }
}
