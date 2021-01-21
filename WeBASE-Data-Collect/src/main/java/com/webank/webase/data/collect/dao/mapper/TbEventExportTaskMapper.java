package com.webank.webase.data.collect.dao.mapper;

import com.webank.webase.data.collect.dao.entity.TbEventExportTask;
import com.webank.webase.data.collect.dao.entity.TbEventExportTaskExample;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TbEventExportTaskMapper {

    @Update({ "update tb_event_export_task", "set task_status = #{status,jdbcType=INTEGER}, modify_time = now()", "where id = #{id,jdbcType=INTEGER}" })
    int updateStatus(@Param("id") Integer id, @Param("status") Integer status);

    @Select({ "select block_number from tb_event_export_task", "where id = #{id,jdbcType=INTEGER}" })
    BigInteger getBlockNumber(@Param("id") Integer id);

    @Update({ "update tb_event_export_task", "set block_number = #{blockNumber,jdbcType=BIGINT}, modify_time = now()", "where id = #{id,jdbcType=INTEGER}" })
    int updateBlockNumber(@Param("id") Integer id, @Param("blockNumber") BigInteger blockNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbEventExportTaskSqlProvider.class, method = "countByExample")
    long countByExample(TbEventExportTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @DeleteProvider(type = TbEventExportTaskSqlProvider.class, method = "deleteByExample")
    int deleteByExample(TbEventExportTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @Delete({ "delete from tb_event_export_task", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @Insert({ "insert into tb_event_export_task (chain_id, group_id, ", "contract_name, contract_address, ", "event_name, block_number, ", "task_status, create_time, ", "modify_time)", "values (#{chainId,jdbcType=INTEGER}, #{groupId,jdbcType=INTEGER}, ", "#{contractName,jdbcType=VARCHAR}, #{contractAddress,jdbcType=VARCHAR}, ", "#{eventName,jdbcType=VARCHAR}, #{blockNumber,jdbcType=BIGINT}, ", "#{taskStatus,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ", "#{modifyTime,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(TbEventExportTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @InsertProvider(type = TbEventExportTaskSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(TbEventExportTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbEventExportTaskSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "contract_name", property = "contractName", jdbcType = JdbcType.VARCHAR), @Result(column = "contract_address", property = "contractAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "event_name", property = "eventName", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    List<TbEventExportTask> selectByExample(TbEventExportTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @Select({ "select", "id, chain_id, group_id, contract_name, contract_address, event_name, block_number, ", "task_status, create_time, modify_time", "from tb_event_export_task", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "contract_name", property = "contractName", jdbcType = JdbcType.VARCHAR), @Result(column = "contract_address", property = "contractAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "event_name", property = "eventName", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    TbEventExportTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbEventExportTaskSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbEventExportTask record, @Param("example") TbEventExportTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbEventExportTaskSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") TbEventExportTask record, @Param("example") TbEventExportTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbEventExportTaskSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbEventExportTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @Update({ "update tb_event_export_task", "set chain_id = #{chainId,jdbcType=INTEGER},", "group_id = #{groupId,jdbcType=INTEGER},", "contract_name = #{contractName,jdbcType=VARCHAR},", "contract_address = #{contractAddress,jdbcType=VARCHAR},", "event_name = #{eventName,jdbcType=VARCHAR},", "block_number = #{blockNumber,jdbcType=BIGINT},", "task_status = #{taskStatus,jdbcType=TINYINT},", "create_time = #{createTime,jdbcType=TIMESTAMP},", "modify_time = #{modifyTime,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(TbEventExportTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert({ "<script>", "insert into tb_event_export_task (chain_id, ", "group_id, contract_name, ", "contract_address, event_name, ", "block_number, task_status, ", "create_time, modify_time)", "values<foreach collection=\"list\" item=\"detail\" index=\"index\" separator=\",\">(#{detail.chainId,jdbcType=INTEGER}, ", "#{detail.groupId,jdbcType=INTEGER}, #{detail.contractName,jdbcType=VARCHAR}, ", "#{detail.contractAddress,jdbcType=VARCHAR}, #{detail.eventName,jdbcType=VARCHAR}, ", "#{detail.blockNumber,jdbcType=BIGINT}, #{detail.taskStatus,jdbcType=TINYINT}, ", "#{detail.createTime,jdbcType=TIMESTAMP}, #{detail.modifyTime,jdbcType=TIMESTAMP})</foreach></script>" })
    int batchInsert(List<TbEventExportTask> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbEventExportTaskSqlProvider.class, method = "getOneByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "contract_name", property = "contractName", jdbcType = JdbcType.VARCHAR), @Result(column = "contract_address", property = "contractAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "event_name", property = "eventName", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    Optional<TbEventExportTask> getOneByExample(TbEventExportTaskExample example);
}