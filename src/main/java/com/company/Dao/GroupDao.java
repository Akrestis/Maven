package com.company.Dao;

import com.company.model.Group;
import com.company.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GroupDao {

    private SessionFactory sessionFactory;

    public GroupDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void close() {
        sessionFactory.close();
    }


    public void addGroup(Group group) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(group);
            transaction.commit();
            session.close();
        }
    }

    public void addStudentToGroup(Student student, Group group) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            student.setGroupId(group.getGroupId());
            session.update(student);
            transaction.commit();
        }
    }

    public int getGroupId(String groupName) {
        try (Session session = sessionFactory.openSession()) {
            return session
                    .createQuery("FROM Group WHERE name = :name ", Group.class)
                    .setParameter("name", groupName)
                    .getSingleResult()
                    .getGroupId();
        }
    }

    public List<Student> getStudentByName(String groupName) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Student WHERE group_id = :group_id ", Student.class)
                    .setParameter("group_id", getGroupId(groupName))
                    .getResultList();
        }
    }

}
