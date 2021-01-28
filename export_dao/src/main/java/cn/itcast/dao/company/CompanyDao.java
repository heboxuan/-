package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;
import cn.itcast.domain.company.CompanyExample;
import java.util.List;

public interface CompanyDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    Company selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Company record);
}