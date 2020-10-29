// ORM class for table 'T71_ACC_FIN_REPORT_EWM'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 29 16:49:10 CST 2020
// For connector: com.cloudera.connector.teradata.TeradataManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class T71_ACC_FIN_REPORT_EWM extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("STAT_MON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.STAT_MON = (String)value;
      }
    });
    setters.put("ROW_SEQ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.ROW_SEQ = (String)value;
      }
    });
    setters.put("LINE_NME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.LINE_NME = (String)value;
      }
    });
    setters.put("FAM_SELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.FAM_SELL = (java.math.BigDecimal)value;
      }
    });
    setters.put("HANDSET_TURNSTILE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.HANDSET_TURNSTILE = (java.math.BigDecimal)value;
      }
    });
    setters.put("DQP_SELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.DQP_SELL = (java.math.BigDecimal)value;
      }
    });
    setters.put("JCP_SELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.JCP_SELL = (java.math.BigDecimal)value;
      }
    });
    setters.put("NOCAST_SELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.NOCAST_SELL = (java.math.BigDecimal)value;
      }
    });
    setters.put("RESERVE_1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.RESERVE_1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RESERVE_2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.RESERVE_2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RESERVE_3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.RESERVE_3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_EWM.this.AMOUNT = (java.math.BigDecimal)value;
      }
    });
  }
  public T71_ACC_FIN_REPORT_EWM() {
    init0();
  }
  private String STAT_MON;
  public String get_STAT_MON() {
    return STAT_MON;
  }
  public void set_STAT_MON(String STAT_MON) {
    this.STAT_MON = STAT_MON;
  }
  public T71_ACC_FIN_REPORT_EWM with_STAT_MON(String STAT_MON) {
    this.STAT_MON = STAT_MON;
    return this;
  }
  private String ROW_SEQ;
  public String get_ROW_SEQ() {
    return ROW_SEQ;
  }
  public void set_ROW_SEQ(String ROW_SEQ) {
    this.ROW_SEQ = ROW_SEQ;
  }
  public T71_ACC_FIN_REPORT_EWM with_ROW_SEQ(String ROW_SEQ) {
    this.ROW_SEQ = ROW_SEQ;
    return this;
  }
  private String LINE_NME;
  public String get_LINE_NME() {
    return LINE_NME;
  }
  public void set_LINE_NME(String LINE_NME) {
    this.LINE_NME = LINE_NME;
  }
  public T71_ACC_FIN_REPORT_EWM with_LINE_NME(String LINE_NME) {
    this.LINE_NME = LINE_NME;
    return this;
  }
  private java.math.BigDecimal FAM_SELL;
  public java.math.BigDecimal get_FAM_SELL() {
    return FAM_SELL;
  }
  public void set_FAM_SELL(java.math.BigDecimal FAM_SELL) {
    this.FAM_SELL = FAM_SELL;
  }
  public T71_ACC_FIN_REPORT_EWM with_FAM_SELL(java.math.BigDecimal FAM_SELL) {
    this.FAM_SELL = FAM_SELL;
    return this;
  }
  private java.math.BigDecimal HANDSET_TURNSTILE;
  public java.math.BigDecimal get_HANDSET_TURNSTILE() {
    return HANDSET_TURNSTILE;
  }
  public void set_HANDSET_TURNSTILE(java.math.BigDecimal HANDSET_TURNSTILE) {
    this.HANDSET_TURNSTILE = HANDSET_TURNSTILE;
  }
  public T71_ACC_FIN_REPORT_EWM with_HANDSET_TURNSTILE(java.math.BigDecimal HANDSET_TURNSTILE) {
    this.HANDSET_TURNSTILE = HANDSET_TURNSTILE;
    return this;
  }
  private java.math.BigDecimal DQP_SELL;
  public java.math.BigDecimal get_DQP_SELL() {
    return DQP_SELL;
  }
  public void set_DQP_SELL(java.math.BigDecimal DQP_SELL) {
    this.DQP_SELL = DQP_SELL;
  }
  public T71_ACC_FIN_REPORT_EWM with_DQP_SELL(java.math.BigDecimal DQP_SELL) {
    this.DQP_SELL = DQP_SELL;
    return this;
  }
  private java.math.BigDecimal JCP_SELL;
  public java.math.BigDecimal get_JCP_SELL() {
    return JCP_SELL;
  }
  public void set_JCP_SELL(java.math.BigDecimal JCP_SELL) {
    this.JCP_SELL = JCP_SELL;
  }
  public T71_ACC_FIN_REPORT_EWM with_JCP_SELL(java.math.BigDecimal JCP_SELL) {
    this.JCP_SELL = JCP_SELL;
    return this;
  }
  private java.math.BigDecimal NOCAST_SELL;
  public java.math.BigDecimal get_NOCAST_SELL() {
    return NOCAST_SELL;
  }
  public void set_NOCAST_SELL(java.math.BigDecimal NOCAST_SELL) {
    this.NOCAST_SELL = NOCAST_SELL;
  }
  public T71_ACC_FIN_REPORT_EWM with_NOCAST_SELL(java.math.BigDecimal NOCAST_SELL) {
    this.NOCAST_SELL = NOCAST_SELL;
    return this;
  }
  private java.math.BigDecimal RESERVE_1;
  public java.math.BigDecimal get_RESERVE_1() {
    return RESERVE_1;
  }
  public void set_RESERVE_1(java.math.BigDecimal RESERVE_1) {
    this.RESERVE_1 = RESERVE_1;
  }
  public T71_ACC_FIN_REPORT_EWM with_RESERVE_1(java.math.BigDecimal RESERVE_1) {
    this.RESERVE_1 = RESERVE_1;
    return this;
  }
  private java.math.BigDecimal RESERVE_2;
  public java.math.BigDecimal get_RESERVE_2() {
    return RESERVE_2;
  }
  public void set_RESERVE_2(java.math.BigDecimal RESERVE_2) {
    this.RESERVE_2 = RESERVE_2;
  }
  public T71_ACC_FIN_REPORT_EWM with_RESERVE_2(java.math.BigDecimal RESERVE_2) {
    this.RESERVE_2 = RESERVE_2;
    return this;
  }
  private java.math.BigDecimal RESERVE_3;
  public java.math.BigDecimal get_RESERVE_3() {
    return RESERVE_3;
  }
  public void set_RESERVE_3(java.math.BigDecimal RESERVE_3) {
    this.RESERVE_3 = RESERVE_3;
  }
  public T71_ACC_FIN_REPORT_EWM with_RESERVE_3(java.math.BigDecimal RESERVE_3) {
    this.RESERVE_3 = RESERVE_3;
    return this;
  }
  private java.math.BigDecimal AMOUNT;
  public java.math.BigDecimal get_AMOUNT() {
    return AMOUNT;
  }
  public void set_AMOUNT(java.math.BigDecimal AMOUNT) {
    this.AMOUNT = AMOUNT;
  }
  public T71_ACC_FIN_REPORT_EWM with_AMOUNT(java.math.BigDecimal AMOUNT) {
    this.AMOUNT = AMOUNT;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_ACC_FIN_REPORT_EWM)) {
      return false;
    }
    T71_ACC_FIN_REPORT_EWM that = (T71_ACC_FIN_REPORT_EWM) o;
    boolean equal = true;
    equal = equal && (this.STAT_MON == null ? that.STAT_MON == null : this.STAT_MON.equals(that.STAT_MON));
    equal = equal && (this.ROW_SEQ == null ? that.ROW_SEQ == null : this.ROW_SEQ.equals(that.ROW_SEQ));
    equal = equal && (this.LINE_NME == null ? that.LINE_NME == null : this.LINE_NME.equals(that.LINE_NME));
    equal = equal && (this.FAM_SELL == null ? that.FAM_SELL == null : this.FAM_SELL.equals(that.FAM_SELL));
    equal = equal && (this.HANDSET_TURNSTILE == null ? that.HANDSET_TURNSTILE == null : this.HANDSET_TURNSTILE.equals(that.HANDSET_TURNSTILE));
    equal = equal && (this.DQP_SELL == null ? that.DQP_SELL == null : this.DQP_SELL.equals(that.DQP_SELL));
    equal = equal && (this.JCP_SELL == null ? that.JCP_SELL == null : this.JCP_SELL.equals(that.JCP_SELL));
    equal = equal && (this.NOCAST_SELL == null ? that.NOCAST_SELL == null : this.NOCAST_SELL.equals(that.NOCAST_SELL));
    equal = equal && (this.RESERVE_1 == null ? that.RESERVE_1 == null : this.RESERVE_1.equals(that.RESERVE_1));
    equal = equal && (this.RESERVE_2 == null ? that.RESERVE_2 == null : this.RESERVE_2.equals(that.RESERVE_2));
    equal = equal && (this.RESERVE_3 == null ? that.RESERVE_3 == null : this.RESERVE_3.equals(that.RESERVE_3));
    equal = equal && (this.AMOUNT == null ? that.AMOUNT == null : this.AMOUNT.equals(that.AMOUNT));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_ACC_FIN_REPORT_EWM)) {
      return false;
    }
    T71_ACC_FIN_REPORT_EWM that = (T71_ACC_FIN_REPORT_EWM) o;
    boolean equal = true;
    equal = equal && (this.STAT_MON == null ? that.STAT_MON == null : this.STAT_MON.equals(that.STAT_MON));
    equal = equal && (this.ROW_SEQ == null ? that.ROW_SEQ == null : this.ROW_SEQ.equals(that.ROW_SEQ));
    equal = equal && (this.LINE_NME == null ? that.LINE_NME == null : this.LINE_NME.equals(that.LINE_NME));
    equal = equal && (this.FAM_SELL == null ? that.FAM_SELL == null : this.FAM_SELL.equals(that.FAM_SELL));
    equal = equal && (this.HANDSET_TURNSTILE == null ? that.HANDSET_TURNSTILE == null : this.HANDSET_TURNSTILE.equals(that.HANDSET_TURNSTILE));
    equal = equal && (this.DQP_SELL == null ? that.DQP_SELL == null : this.DQP_SELL.equals(that.DQP_SELL));
    equal = equal && (this.JCP_SELL == null ? that.JCP_SELL == null : this.JCP_SELL.equals(that.JCP_SELL));
    equal = equal && (this.NOCAST_SELL == null ? that.NOCAST_SELL == null : this.NOCAST_SELL.equals(that.NOCAST_SELL));
    equal = equal && (this.RESERVE_1 == null ? that.RESERVE_1 == null : this.RESERVE_1.equals(that.RESERVE_1));
    equal = equal && (this.RESERVE_2 == null ? that.RESERVE_2 == null : this.RESERVE_2.equals(that.RESERVE_2));
    equal = equal && (this.RESERVE_3 == null ? that.RESERVE_3 == null : this.RESERVE_3.equals(that.RESERVE_3));
    equal = equal && (this.AMOUNT == null ? that.AMOUNT == null : this.AMOUNT.equals(that.AMOUNT));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STAT_MON = JdbcWritableBridge.readString(1, __dbResults);
    this.ROW_SEQ = JdbcWritableBridge.readString(2, __dbResults);
    this.LINE_NME = JdbcWritableBridge.readString(3, __dbResults);
    this.FAM_SELL = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.HANDSET_TURNSTILE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DQP_SELL = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.JCP_SELL = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NOCAST_SELL = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.RESERVE_1 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.RESERVE_2 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.RESERVE_3 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.AMOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STAT_MON = JdbcWritableBridge.readString(1, __dbResults);
    this.ROW_SEQ = JdbcWritableBridge.readString(2, __dbResults);
    this.LINE_NME = JdbcWritableBridge.readString(3, __dbResults);
    this.FAM_SELL = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.HANDSET_TURNSTILE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DQP_SELL = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.JCP_SELL = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NOCAST_SELL = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.RESERVE_1 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.RESERVE_2 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.RESERVE_3 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.AMOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STAT_MON, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ROW_SEQ, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LINE_NME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAM_SELL, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HANDSET_TURNSTILE, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DQP_SELL, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(JCP_SELL, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NOCAST_SELL, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_1, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_2, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_3, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMOUNT, 12 + __off, 3, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STAT_MON, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ROW_SEQ, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LINE_NME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAM_SELL, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HANDSET_TURNSTILE, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DQP_SELL, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(JCP_SELL, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NOCAST_SELL, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_1, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_2, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RESERVE_3, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMOUNT, 12 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.STAT_MON = null;
    } else {
    this.STAT_MON = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ROW_SEQ = null;
    } else {
    this.ROW_SEQ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LINE_NME = null;
    } else {
    this.LINE_NME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAM_SELL = null;
    } else {
    this.FAM_SELL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HANDSET_TURNSTILE = null;
    } else {
    this.HANDSET_TURNSTILE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DQP_SELL = null;
    } else {
    this.DQP_SELL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JCP_SELL = null;
    } else {
    this.JCP_SELL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NOCAST_SELL = null;
    } else {
    this.NOCAST_SELL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RESERVE_1 = null;
    } else {
    this.RESERVE_1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RESERVE_2 = null;
    } else {
    this.RESERVE_2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RESERVE_3 = null;
    } else {
    this.RESERVE_3 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AMOUNT = null;
    } else {
    this.AMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STAT_MON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STAT_MON);
    }
    if (null == this.ROW_SEQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROW_SEQ);
    }
    if (null == this.LINE_NME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_NME);
    }
    if (null == this.FAM_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FAM_SELL, __dataOut);
    }
    if (null == this.HANDSET_TURNSTILE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.HANDSET_TURNSTILE, __dataOut);
    }
    if (null == this.DQP_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.DQP_SELL, __dataOut);
    }
    if (null == this.JCP_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.JCP_SELL, __dataOut);
    }
    if (null == this.NOCAST_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.NOCAST_SELL, __dataOut);
    }
    if (null == this.RESERVE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_1, __dataOut);
    }
    if (null == this.RESERVE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_2, __dataOut);
    }
    if (null == this.RESERVE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_3, __dataOut);
    }
    if (null == this.AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.AMOUNT, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.STAT_MON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STAT_MON);
    }
    if (null == this.ROW_SEQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROW_SEQ);
    }
    if (null == this.LINE_NME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_NME);
    }
    if (null == this.FAM_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FAM_SELL, __dataOut);
    }
    if (null == this.HANDSET_TURNSTILE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.HANDSET_TURNSTILE, __dataOut);
    }
    if (null == this.DQP_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.DQP_SELL, __dataOut);
    }
    if (null == this.JCP_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.JCP_SELL, __dataOut);
    }
    if (null == this.NOCAST_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.NOCAST_SELL, __dataOut);
    }
    if (null == this.RESERVE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_1, __dataOut);
    }
    if (null == this.RESERVE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_2, __dataOut);
    }
    if (null == this.RESERVE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.RESERVE_3, __dataOut);
    }
    if (null == this.AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.AMOUNT, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(STAT_MON==null?"\\N":STAT_MON, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROW_SEQ==null?"\\N":ROW_SEQ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_NME==null?"\\N":LINE_NME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAM_SELL==null?"\\N":FAM_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HANDSET_TURNSTILE==null?"\\N":HANDSET_TURNSTILE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DQP_SELL==null?"\\N":DQP_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JCP_SELL==null?"\\N":JCP_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOCAST_SELL==null?"\\N":NOCAST_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_1==null?"\\N":RESERVE_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_2==null?"\\N":RESERVE_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_3==null?"\\N":RESERVE_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMOUNT==null?"\\N":AMOUNT.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STAT_MON==null?"\\N":STAT_MON, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROW_SEQ==null?"\\N":ROW_SEQ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_NME==null?"\\N":LINE_NME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAM_SELL==null?"\\N":FAM_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HANDSET_TURNSTILE==null?"\\N":HANDSET_TURNSTILE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DQP_SELL==null?"\\N":DQP_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JCP_SELL==null?"\\N":JCP_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOCAST_SELL==null?"\\N":NOCAST_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_1==null?"\\N":RESERVE_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_2==null?"\\N":RESERVE_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RESERVE_3==null?"\\N":RESERVE_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMOUNT==null?"\\N":AMOUNT.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.STAT_MON = null; } else {
      this.STAT_MON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ROW_SEQ = null; } else {
      this.ROW_SEQ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LINE_NME = null; } else {
      this.LINE_NME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FAM_SELL = null; } else {
      this.FAM_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HANDSET_TURNSTILE = null; } else {
      this.HANDSET_TURNSTILE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DQP_SELL = null; } else {
      this.DQP_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.JCP_SELL = null; } else {
      this.JCP_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NOCAST_SELL = null; } else {
      this.NOCAST_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_1 = null; } else {
      this.RESERVE_1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_2 = null; } else {
      this.RESERVE_2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_3 = null; } else {
      this.RESERVE_3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AMOUNT = null; } else {
      this.AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.STAT_MON = null; } else {
      this.STAT_MON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ROW_SEQ = null; } else {
      this.ROW_SEQ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LINE_NME = null; } else {
      this.LINE_NME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FAM_SELL = null; } else {
      this.FAM_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HANDSET_TURNSTILE = null; } else {
      this.HANDSET_TURNSTILE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DQP_SELL = null; } else {
      this.DQP_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.JCP_SELL = null; } else {
      this.JCP_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NOCAST_SELL = null; } else {
      this.NOCAST_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_1 = null; } else {
      this.RESERVE_1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_2 = null; } else {
      this.RESERVE_2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RESERVE_3 = null; } else {
      this.RESERVE_3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AMOUNT = null; } else {
      this.AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T71_ACC_FIN_REPORT_EWM o = (T71_ACC_FIN_REPORT_EWM) super.clone();
    return o;
  }

  public void clone0(T71_ACC_FIN_REPORT_EWM o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("STAT_MON", this.STAT_MON);
    __sqoop$field_map.put("ROW_SEQ", this.ROW_SEQ);
    __sqoop$field_map.put("LINE_NME", this.LINE_NME);
    __sqoop$field_map.put("FAM_SELL", this.FAM_SELL);
    __sqoop$field_map.put("HANDSET_TURNSTILE", this.HANDSET_TURNSTILE);
    __sqoop$field_map.put("DQP_SELL", this.DQP_SELL);
    __sqoop$field_map.put("JCP_SELL", this.JCP_SELL);
    __sqoop$field_map.put("NOCAST_SELL", this.NOCAST_SELL);
    __sqoop$field_map.put("RESERVE_1", this.RESERVE_1);
    __sqoop$field_map.put("RESERVE_2", this.RESERVE_2);
    __sqoop$field_map.put("RESERVE_3", this.RESERVE_3);
    __sqoop$field_map.put("AMOUNT", this.AMOUNT);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STAT_MON", this.STAT_MON);
    __sqoop$field_map.put("ROW_SEQ", this.ROW_SEQ);
    __sqoop$field_map.put("LINE_NME", this.LINE_NME);
    __sqoop$field_map.put("FAM_SELL", this.FAM_SELL);
    __sqoop$field_map.put("HANDSET_TURNSTILE", this.HANDSET_TURNSTILE);
    __sqoop$field_map.put("DQP_SELL", this.DQP_SELL);
    __sqoop$field_map.put("JCP_SELL", this.JCP_SELL);
    __sqoop$field_map.put("NOCAST_SELL", this.NOCAST_SELL);
    __sqoop$field_map.put("RESERVE_1", this.RESERVE_1);
    __sqoop$field_map.put("RESERVE_2", this.RESERVE_2);
    __sqoop$field_map.put("RESERVE_3", this.RESERVE_3);
    __sqoop$field_map.put("AMOUNT", this.AMOUNT);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
