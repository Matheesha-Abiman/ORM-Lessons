# 🎯 ORM-Lessons - Object Relational Mapping (ORM) in Hibernate  

🚀 **Master Hibernate & ORM with Practical Examples!**  

---

## 📌 Overview  
This repository contains lessons and hands-on examples of **Object Relational Mapping (ORM)** using **Hibernate**.  
With ORM, developers can **seamlessly** interact with relational databases **using objects**, eliminating the need for complex SQL queries.  

---

## 🔥 What is ORM?  
**Object Relational Mapping (ORM)** is a programming technique that enables the conversion of data between **object-oriented programming** and **relational databases**. It **simplifies** database operations by allowing developers to use **Java objects** instead of writing raw SQL queries.  

### 🎯 Key Benefits of ORM:  
✅ **Minimizes boilerplate SQL code**  
✅ **Database portability** (supports multiple databases)  
✅ **Automatic schema generation**  
✅ **Optimized performance with caching**  
✅ **Ensures database consistency through transactions**  

---

## ❓ Why Hibernate?  
**Hibernate** is a powerful ORM framework for Java, designed to simplify database interactions.  

🔹 **Advantages of Hibernate:**  
✅ **Automatic SQL generation** 🛠  
✅ **Simplified data persistence** 🗄  
✅ **Transaction management** ⚡  
✅ **Performance boost with caching** 🚀  
✅ **Cross-database compatibility** 🔄  
✅ **Supports various fetching strategies** 🔎  

---

## 📚 Topics Covered  

🎯 **Fundamentals:**  
- 🛠 Introduction to ORM  
- ⚙️ Setting up Hibernate  
- 🏗 Hibernate Configuration (`hibernate.cfg.xml`)  

🔹 **Working with Entities & Annotations:**  
- 🎨 Mapping Entities with Annotations  
- 📌 CRUD Operations in Hibernate  

🔹 **Advanced Concepts:**  
- 🛠 Hibernate Query Language (HQL)  
- 🔄 Entity Relationships (**One-to-One, One-to-Many, Many-to-Many**)  
- ⚡ Caching Mechanism in Hibernate  

---

## 🏗 About Entities & Annotations in Hibernate  

Hibernate uses **Java classes as database tables**, known as **Entities**.  
These entities are **mapped** using special **annotations**.  

### 🏷 Key Hibernate Annotations  

| Annotation | Description |
|------------|-------------|
| `@Entity` | Marks a class as a database entity |
| `@Table(name = "table_name")` | Defines the database table name |
| `@Id` | Specifies the primary key |
| `@GeneratedValue(strategy = GenerationType.IDENTITY)` | Enables auto-increment for primary keys |
| `@Column(name = "column_name")` | Maps a Java field to a database column |
| `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany` | Defines relationships between entities |

