package com.ma.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(String value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(String value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(String value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(String value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLike(String value) {
            addCriterion("hospital_id like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotLike(String value) {
            addCriterion("hospital_id not like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<String> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<String> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(String value1, String value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(String value1, String value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdIsNull() {
            addCriterion("dept_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdIsNotNull() {
            addCriterion("dept_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdEqualTo(String value) {
            addCriterion("dept_attr_id =", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdNotEqualTo(String value) {
            addCriterion("dept_attr_id <>", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdGreaterThan(String value) {
            addCriterion("dept_attr_id >", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_attr_id >=", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdLessThan(String value) {
            addCriterion("dept_attr_id <", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdLessThanOrEqualTo(String value) {
            addCriterion("dept_attr_id <=", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdLike(String value) {
            addCriterion("dept_attr_id like", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdNotLike(String value) {
            addCriterion("dept_attr_id not like", value, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdIn(List<String> values) {
            addCriterion("dept_attr_id in", values, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdNotIn(List<String> values) {
            addCriterion("dept_attr_id not in", values, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdBetween(String value1, String value2) {
            addCriterion("dept_attr_id between", value1, value2, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrIdNotBetween(String value1, String value2) {
            addCriterion("dept_attr_id not between", value1, value2, "deptAttrId");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeIsNull() {
            addCriterion("dept_attr_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeIsNotNull() {
            addCriterion("dept_attr_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeEqualTo(String value) {
            addCriterion("dept_attr_code =", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeNotEqualTo(String value) {
            addCriterion("dept_attr_code <>", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeGreaterThan(String value) {
            addCriterion("dept_attr_code >", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_attr_code >=", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeLessThan(String value) {
            addCriterion("dept_attr_code <", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_attr_code <=", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeLike(String value) {
            addCriterion("dept_attr_code like", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeNotLike(String value) {
            addCriterion("dept_attr_code not like", value, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeIn(List<String> values) {
            addCriterion("dept_attr_code in", values, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeNotIn(List<String> values) {
            addCriterion("dept_attr_code not in", values, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeBetween(String value1, String value2) {
            addCriterion("dept_attr_code between", value1, value2, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andDeptAttrCodeNotBetween(String value1, String value2) {
            addCriterion("dept_attr_code not between", value1, value2, "deptAttrCode");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("creator_id like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("creator_id not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(String value) {
            addCriterion("updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(String value) {
            addCriterion("updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(String value) {
            addCriterion("updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(String value) {
            addCriterion("updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(String value) {
            addCriterion("updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLike(String value) {
            addCriterion("updater_id like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotLike(String value) {
            addCriterion("updater_id not like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<String> values) {
            addCriterion("updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<String> values) {
            addCriterion("updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(String value1, String value2) {
            addCriterion("updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(String value1, String value2) {
            addCriterion("updater_id not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("updater_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("updater_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("updater_name =", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("updater_name <>", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("updater_name >", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("updater_name >=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("updater_name <", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("updater_name <=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("updater_name like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("updater_name not like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIn(List<String> values) {
            addCriterion("updater_name in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotIn(List<String> values) {
            addCriterion("updater_name not in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("updater_name between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("updater_name not between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeIsNull() {
            addCriterion("corporate_code is null");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeIsNotNull() {
            addCriterion("corporate_code is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeEqualTo(String value) {
            addCriterion("corporate_code =", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeNotEqualTo(String value) {
            addCriterion("corporate_code <>", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeGreaterThan(String value) {
            addCriterion("corporate_code >", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_code >=", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeLessThan(String value) {
            addCriterion("corporate_code <", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeLessThanOrEqualTo(String value) {
            addCriterion("corporate_code <=", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeLike(String value) {
            addCriterion("corporate_code like", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeNotLike(String value) {
            addCriterion("corporate_code not like", value, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeIn(List<String> values) {
            addCriterion("corporate_code in", values, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeNotIn(List<String> values) {
            addCriterion("corporate_code not in", values, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeBetween(String value1, String value2) {
            addCriterion("corporate_code between", value1, value2, "corporateCode");
            return (Criteria) this;
        }

        public Criteria andCorporateCodeNotBetween(String value1, String value2) {
            addCriterion("corporate_code not between", value1, value2, "corporateCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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