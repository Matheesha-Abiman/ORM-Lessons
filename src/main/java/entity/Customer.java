package entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity // map to table
@Table(name = "customer_table") // set database table name
public class Customer { // default table name (customer)
    @Id // primary key
//    @GeneratedValue(strategy = GenerationType.AUTO) // auto generate
    @GeneratedValue(strategy = GenerationType.IDENTITY) // manual add id
//    @GeneratedValue(strategy = GenerationType.UUID) // create unique random id
    private int id;
    private String name;

    @Column(name = "customer_email", nullable = true)
    // nullable true - can null
    // nullable false - cannot null
    private String email;

    @Column(nullable = false)
    private String phone;

    @Transient // for sensitive data,
    // non persist
    private String cardNumber;

    @Lob // large data or binary data
    private String description;

    @Embedded
    private CustomerFullName fullName;
}
// image -> byte[] -> base64 encoded string










