package com.lidetao.dao.po;

import java.util.ArrayList;
import java.util.List;

public class WikiBlockExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public WikiBlockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andFileIsNull() {
            addCriterion("file is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("file is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("file =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("file <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("file >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("file >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("file <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("file <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("file like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("file not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("file in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("file not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("file between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("file not between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaorderIsNull() {
            addCriterion("areaorder is null");
            return (Criteria) this;
        }

        public Criteria andAreaorderIsNotNull() {
            addCriterion("areaorder is not null");
            return (Criteria) this;
        }

        public Criteria andAreaorderEqualTo(Byte value) {
            addCriterion("areaorder =", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotEqualTo(Byte value) {
            addCriterion("areaorder <>", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderGreaterThan(Byte value) {
            addCriterion("areaorder >", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderGreaterThanOrEqualTo(Byte value) {
            addCriterion("areaorder >=", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderLessThan(Byte value) {
            addCriterion("areaorder <", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderLessThanOrEqualTo(Byte value) {
            addCriterion("areaorder <=", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderIn(List<Byte> values) {
            addCriterion("areaorder in", values, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotIn(List<Byte> values) {
            addCriterion("areaorder not in", values, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderBetween(Byte value1, Byte value2) {
            addCriterion("areaorder between", value1, value2, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotBetween(Byte value1, Byte value2) {
            addCriterion("areaorder not between", value1, value2, "areaorder");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("block like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("block not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andFunIsNull() {
            addCriterion("fun is null");
            return (Criteria) this;
        }

        public Criteria andFunIsNotNull() {
            addCriterion("fun is not null");
            return (Criteria) this;
        }

        public Criteria andFunEqualTo(String value) {
            addCriterion("fun =", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotEqualTo(String value) {
            addCriterion("fun <>", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunGreaterThan(String value) {
            addCriterion("fun >", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunGreaterThanOrEqualTo(String value) {
            addCriterion("fun >=", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLessThan(String value) {
            addCriterion("fun <", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLessThanOrEqualTo(String value) {
            addCriterion("fun <=", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLike(String value) {
            addCriterion("fun like", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotLike(String value) {
            addCriterion("fun not like", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunIn(List<String> values) {
            addCriterion("fun in", values, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotIn(List<String> values) {
            addCriterion("fun not in", values, "fun");
            return (Criteria) this;
        }

        public Criteria andFunBetween(String value1, String value2) {
            addCriterion("fun between", value1, value2, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotBetween(String value1, String value2) {
            addCriterion("fun not between", value1, value2, "fun");
            return (Criteria) this;
        }

        public Criteria andTplIsNull() {
            addCriterion("tpl is null");
            return (Criteria) this;
        }

        public Criteria andTplIsNotNull() {
            addCriterion("tpl is not null");
            return (Criteria) this;
        }

        public Criteria andTplEqualTo(String value) {
            addCriterion("tpl =", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotEqualTo(String value) {
            addCriterion("tpl <>", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThan(String value) {
            addCriterion("tpl >", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThanOrEqualTo(String value) {
            addCriterion("tpl >=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThan(String value) {
            addCriterion("tpl <", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThanOrEqualTo(String value) {
            addCriterion("tpl <=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLike(String value) {
            addCriterion("tpl like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotLike(String value) {
            addCriterion("tpl not like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplIn(List<String> values) {
            addCriterion("tpl in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotIn(List<String> values) {
            addCriterion("tpl not in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplBetween(String value1, String value2) {
            addCriterion("tpl between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotBetween(String value1, String value2) {
            addCriterion("tpl not between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Integer value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Integer value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Integer value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Integer value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Integer value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Integer> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Integer> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Integer value1, Integer value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wiki_block
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 12 13:31:40 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wiki_block
     *
     * @mbggenerated Sun Mar 12 13:31:40 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}