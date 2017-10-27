/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fi.muni.pa165.library.persistance.dao;

import cz.fi.muni.pa165.library.persistance.entity.Member;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class LoanDaoImpl implements LoanDao {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void create(LoanDao loan) {
         em.persist(loan);
    }

    @Override
    public void delete(LoanDao loan) {
        Objects.requireNonNull(loan, "null argument loan");
         em.remove(loan);
    }

    @Override
    public LoanDao findById(Long id) {
        return em.find(LoanDao.class, id);
    }

    @Override
    public List<LoanDao> allLoansOfMember(Member member) {
       return em.createQuery("select l from loans l where l.member = :member", LoanDao.class)
                                            .setParameter("member", member).getResultList();
    }

    @Override
    public List<LoanDao> findAll() {
        return em.createQuery("select l from loans l", LoanDao.class).getResultList();
    }

    @Override
    public void update(LoanDao loan) {
        em.merge(loan);
    }
    
}
