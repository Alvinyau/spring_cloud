package personal.alvin.dao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

    private Date createDate;

}
