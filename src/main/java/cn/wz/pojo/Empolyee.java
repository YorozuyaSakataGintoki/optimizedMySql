package cn.wz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Component
public class Empolyee implements Serializable {
    private int id;
    private String empName;
}
