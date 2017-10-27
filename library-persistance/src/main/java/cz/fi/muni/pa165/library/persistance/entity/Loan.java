package cz.fi.muni.pa165.library.persistance.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Entity representing loan 
 *
 * @author xchomo
 */
@Entity
public class Loan {

    public Loan() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date loanCreated;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date loanReturned;
    
    @NotNull
    @ManyToOne
    private Member member;
    
    @NotNull
    @Column(nullable = false)
    @OneToMany(mappedBy = "loan")
    private Set<LoanItem> loanItems = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLoanCreated() {
        return loanCreated;
    }

    public void setLoanCreated(Date loanCreated) {
        this.loanCreated = loanCreated;
    }

    public Date getLoanReturned() {
        return loanReturned;
    }

    public void setLoanReturned(Date loanReturned) {
        this.loanReturned = loanReturned;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Set<LoanItem> getLoanItems() {
        return loanItems;
    }

    public void setLoanItems(Set<LoanItem> loanItems) {
        this.loanItems = loanItems;
    }
    
    
}
