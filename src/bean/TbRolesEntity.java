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
@Table(name = "tb_roles", schema = "dingcan", catalog = "")
public class TbRolesEntity {
    private long id;
    private String roleName;
    private long mealId;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RoleName", nullable = true, length = -1)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "MealId", nullable = false)
    public long getMealId() {
        return mealId;
    }

    public void setMealId(long mealId) {
        this.mealId = mealId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbRolesEntity that = (TbRolesEntity) o;
        return id == that.id &&
                mealId == that.mealId &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, roleName, mealId);
    }
}
