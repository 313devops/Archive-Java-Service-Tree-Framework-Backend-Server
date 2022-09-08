/*
 * @author Dongmin.lee
 * @since 2022-06-17
 * @version 22.06.17
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package egovframework.api.arms.module_pdservice.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import egovframework.com.ext.jstree.springHibernate.core.vo.JsTreeHibernateDTO;
import egovframework.com.ext.jstree.springHibernate.core.vo.JsTreeHibernateSearchDTO;

@Entity
@Table(name = "T_ARMS_PDSERVICE")
@SelectBeforeUpdate(value=true)
@DynamicInsert(value=true)
@DynamicUpdate(value=true)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SequenceGenerator(name = "JsTreeSequence", sequenceName = "S_ARMS_PDSERVICE", allocationSize = 1)
public class PdServiceDTO extends JsTreeHibernateSearchDTO implements Serializable {

    public PdServiceDTO() {
        super();
    }

    public PdServiceDTO(Boolean copyBooleanValue) {
        super();
        this.copyBooleanValue = copyBooleanValue;
    }

    //@Getter @Setter
    private String c_contents;

    @Lob
    @Column(name="C_CONTENTS")
    public String getC_contents() {
        return c_contents;
    }

    public void setC_contents(String c_contents) {
        this.c_contents = c_contents;
    }

    private String c_etc;

    @Column(name="C_ETC")
    public String getC_etc() {
        return c_etc;
    }

    public void setC_etc(String c_etc) {
        this.c_etc = c_etc;
    }

    private String c_owner;

    @Column(name="C_OWNER")
    public String getC_owner() {
        return c_owner;
    }

    public void setC_owner(String c_owner) {
        this.c_owner = c_owner;
    }

    private String c_reviewer01;

    @Column(name="C_REVIEWER01")
    public String getC_reviewer01() {
        return c_reviewer01;
    }

    public void setC_reviewer01(String c_reviewer01) {
        this.c_reviewer01 = c_reviewer01;
    }

    private String c_reviewer02;

    @Column(name="C_REVIEWER02")
    public String getC_reviewer02() {
        return c_reviewer02;
    }

    public void setC_reviewer02(String c_reviewer02) {
        this.c_reviewer02 = c_reviewer02;
    }

    private String c_reviewer03;

    @Column(name="C_REVIEWER03")
    public String getC_reviewer03() {
        return c_reviewer03;
    }

    public void setC_reviewer03(String c_reviewer03) {
        this.c_reviewer03 = c_reviewer03;
    }

    private String c_reviewer04;

    @Column(name="C_REVIEWER04")
    public String getC_reviewer04() {
        return c_reviewer04;
    }

    public void setC_reviewer04(String c_reviewer04) {
        this.c_reviewer04 = c_reviewer04;
    }

    private String c_reviewer05;

    @Column(name="C_REVIEWER05")
    public String getC_reviewer05() {
        return c_reviewer05;
    }

    public void setC_reviewer05(String c_reviewer05) {
        this.c_reviewer05 = c_reviewer05;
    }

    private String c_writer_name;

    @Column(name="C_WRITER_NAME")
    public String getC_writer_name() {
        return c_writer_name;
    }

    public void setC_writer_name(String c_writer_name) {
        this.c_writer_name = c_writer_name;
    }

    private String c_writer_cn;

    @Column(name="C_WRITER_CN")
    public String getC_writer_cn() {
        return c_writer_cn;
    }

    public void setC_writer_cn(String c_writer_cn) {
        this.c_writer_cn = c_writer_cn;
    }

    private String c_writer_mail;

    @Column(name="C_WRITER_MAIL")
    public String getC_writer_mail() {
        return c_writer_mail;
    }

    public void setC_writer_mail(String c_writer_mail) {
        this.c_writer_mail = c_writer_mail;
    }

    private String c_writer_date;

    @Column(name="C_WRITER_DATE")
    public String getC_writer_date() {
        return c_writer_date;
    }

    public void setC_writer_date(String c_writer_date) {
        this.c_writer_date = c_writer_date;
    }

    private String c_filepath;

    @Column(name="C_FILEPATH")
    public String getC_filepath() {
        return c_filepath;
    }

    public void setC_filepath(String c_filepath) {
        this.c_filepath = c_filepath;
    }

    private String c_filename01;

    @Column(name="C_FILENAME01")
    public String getC_filename01() {
        return c_filename01;
    }

    public void setC_filename01(String c_filename01) {
        this.c_filename01 = c_filename01;
    }

    private String c_filename02;

    @Column(name="C_FILENAME02")
    public String getC_filename02() {
        return c_filename02;
    }

    public void setC_filename02(String c_filename02) {
        this.c_filename02 = c_filename02;
    }

    private String c_filename03;

    @Column(name="C_FILENAME03")
    public String getC_filename03() {
        return c_filename03;
    }

    public void setC_filename03(String c_filename03) {
        this.c_filename03 = c_filename03;
    }

    private String c_filename04;

    @Column(name="C_FILENAME04")
    public String getC_filename04() {
        return c_filename04;
    }

    public void setC_filename04(String c_filename04) {
        this.c_filename04 = c_filename04;
    }

    private String c_filename05;

    @Column(name="C_FILENAME05")
    public String getC_filename05() {
        return c_filename05;
    }

    public void setC_filename05(String c_filename05) {
        this.c_filename05 = c_filename05;
    }

    private String c_filename06;

    @Column(name="C_FILENAME06")
    public String getC_filename06() {
        return c_filename06;
    }

    public void setC_filename06(String c_filename06) {
        this.c_filename06 = c_filename06;
    }

    private String c_filename07;

    @Column(name="C_FILENAME07")
    public String getC_filename07() {
        return c_filename07;
    }

    public void setC_filename07(String c_filename07) {
        this.c_filename07 = c_filename07;
    }

    private String c_filename08;

    @Column(name="C_FILENAME08")
    public String getC_filename08() {
        return c_filename08;
    }

    public void setC_filename08(String c_filename08) {
        this.c_filename08 = c_filename08;
    }

    private String c_filename09;

    @Column(name="C_FILENAME09")
    public String getC_filename09() {
        return c_filename09;
    }

    public void setC_filename09(String c_filename09) {
        this.c_filename09 = c_filename09;
    }

    private String c_filename10;

    @Column(name="C_FILENAME10")
    public String getC_filename10() {
        return c_filename10;
    }

    public void setC_filename10(String c_filename10) {
        this.c_filename10 = c_filename10;
    }

    /*
     * Extend Bean Field
     */
    private Boolean copyBooleanValue;

    @Transient
    public Boolean getCopyBooleanValue() {
        copyBooleanValue = false;
        if (this.getCopy() == 0) {
            copyBooleanValue = false;
        } else {
            copyBooleanValue = true;
        }
        return copyBooleanValue;
    }

    public void setCopyBooleanValue(Boolean copyBooleanValue) {
        this.copyBooleanValue = copyBooleanValue;
    }

    @Override
    public <T extends JsTreeHibernateSearchDTO> void setFieldFromNewInstance(T paramInstance) {
        if( paramInstance instanceof JsTreeHibernateDTO){
            if(paramInstance.isCopied()) {
                this.setC_title("copy_" + this.getC_title());
            }
        }
    }
}