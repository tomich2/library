package cz.fi.muni.pa165.library.persistance.dao;

import cz.fi.muni.pa165.library.persistance.entity.Member;
import java.util.List;

/**
 *
 * @author xchomo
 */
public interface LoanDao {
    
    /**
     * Create loan in database
     *
     * @param loan to be created
     */
    public void create(LoanDao loan);

    /**
     * Delete loan from database
     *
     * @param loan to be deleted
     */
    public void delete(LoanDao loan);

    /**
     * Find a loan with specific id from the database
     *
     * @param id of loan to be returned
     * @return loan with specified Id 
     */
    public LoanDao findById(Long id);

    /**
     * Returns all loans for the member 
     *
     * @param member for witch loans should be returned
     * @return all loans for specified member 
     */
    
    public List<LoanDao> allLoansOfMember(Member member);

    /**
     * Returns all  loans of the member
     *
     * @return all loans 
     */
    public List<LoanDao> findAll();

    /**
     * Updates specified loan
     *
     * @param loan to be updated
     */
    public void update(LoanDao loan);
}
