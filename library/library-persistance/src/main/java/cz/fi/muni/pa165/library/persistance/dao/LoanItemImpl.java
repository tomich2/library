/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fi.muni.pa165.library.persistance.dao;

import cz.fi.muni.pa165.library.persistance.entity.Loan;
import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class LoanItemImpl implements LoanItem {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void create(LoanItem loanItem) {
       em.persist(loanItem);
    }

    @Override
    public void delete(LoanItem loanItem) {
        em.remove(loanItem);
    }

    @Override
    public void update(LoanItem loanItem) {
        em.merge(loanItem);
    }

    @Override
    public LoanItem findById(Long id) {
        return em.find(LoanItem.class, id);
    }

    @Override
    public List<LoanItem> findByLoan(Loan loan) {
        return em.createQuery("SELECT l FROM LoanItem l WHERE l.loan = :loanid", LoanItem.class)
                                                                    .setParameter("loanid", loan)
                                                                    .getResultList();
    }

    @Override
    public List<LoanItem> findAll() {
        return em.createQuery("select l from LoanItem l", LoanItem.class).getResultList();
    }
    
}
