// ORM class for table 'T71_ACC_FIN_REPORT_YPT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 29 16:52:11 CST 2020
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

public class T71_ACC_FIN_REPORT_YPT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("STAT_MON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.STAT_MON = (String)value;
      }
    });
    setters.put("ROW_SEQ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.ROW_SEQ = (String)value;
      }
    });
    setters.put("LINE_NME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.LINE_NME = (String)value;
      }
    });
    setters.put("INCOME_LINE_SELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_LINE_SELL = (java.math.BigDecimal)value;
      }
    });
    setters.put("INCOME_LINE_OFFSET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_LINE_OFFSET = (java.math.BigDecimal)value;
      }
    });
    setters.put("INCOME_LINE_REPARATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_LINE_REPARATION = (java.math.BigDecimal)value;
      }
    });
    setters.put("INCOME_LINE_REIMBURSE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_LINE_REIMBURSE = (java.math.BigDecimal)value;
      }
    });
    setters.put("INCOME_LINE_CLEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_LINE_CLEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("INCOME_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.INCOME_AMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_LINE_CONSUME_CLEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_LINE_CONSUME_CLEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_LINE_REPARATION_CLEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_LINE_REPARATION_CLEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_LINE_PRE_INCOME_CLEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_LINE_PRE_INCOME_CLEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_LINE_AGENT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_LINE_AGENT = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_LINE_MANUAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_LINE_MANUAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("PAY_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.PAY_AMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("IMCOME_PAY_NET_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_ACC_FIN_REPORT_YPT.this.IMCOME_PAY_NET_AMOUNT = (java.math.BigDecimal)value;
      }
    });
  }
  public T71_ACC_FIN_REPORT_YPT() {
    init0();
  }
  private String STAT_MON;
  public String get_STAT_MON() {
    return STAT_MON;
  }
  public void set_STAT_MON(String STAT_MON) {
    this.STAT_MON = STAT_MON;
  }
  public T71_ACC_FIN_REPORT_YPT with_STAT_MON(String STAT_MON) {
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
  public T71_ACC_FIN_REPORT_YPT with_ROW_SEQ(String ROW_SEQ) {
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
  public T71_ACC_FIN_REPORT_YPT with_LINE_NME(String LINE_NME) {
    this.LINE_NME = LINE_NME;
    return this;
  }
  private java.math.BigDecimal INCOME_LINE_SELL;
  public java.math.BigDecimal get_INCOME_LINE_SELL() {
    return INCOME_LINE_SELL;
  }
  public void set_INCOME_LINE_SELL(java.math.BigDecimal INCOME_LINE_SELL) {
    this.INCOME_LINE_SELL = INCOME_LINE_SELL;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_LINE_SELL(java.math.BigDecimal INCOME_LINE_SELL) {
    this.INCOME_LINE_SELL = INCOME_LINE_SELL;
    return this;
  }
  private java.math.BigDecimal INCOME_LINE_OFFSET;
  public java.math.BigDecimal get_INCOME_LINE_OFFSET() {
    return INCOME_LINE_OFFSET;
  }
  public void set_INCOME_LINE_OFFSET(java.math.BigDecimal INCOME_LINE_OFFSET) {
    this.INCOME_LINE_OFFSET = INCOME_LINE_OFFSET;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_LINE_OFFSET(java.math.BigDecimal INCOME_LINE_OFFSET) {
    this.INCOME_LINE_OFFSET = INCOME_LINE_OFFSET;
    return this;
  }
  private java.math.BigDecimal INCOME_LINE_REPARATION;
  public java.math.BigDecimal get_INCOME_LINE_REPARATION() {
    return INCOME_LINE_REPARATION;
  }
  public void set_INCOME_LINE_REPARATION(java.math.BigDecimal INCOME_LINE_REPARATION) {
    this.INCOME_LINE_REPARATION = INCOME_LINE_REPARATION;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_LINE_REPARATION(java.math.BigDecimal INCOME_LINE_REPARATION) {
    this.INCOME_LINE_REPARATION = INCOME_LINE_REPARATION;
    return this;
  }
  private java.math.BigDecimal INCOME_LINE_REIMBURSE;
  public java.math.BigDecimal get_INCOME_LINE_REIMBURSE() {
    return INCOME_LINE_REIMBURSE;
  }
  public void set_INCOME_LINE_REIMBURSE(java.math.BigDecimal INCOME_LINE_REIMBURSE) {
    this.INCOME_LINE_REIMBURSE = INCOME_LINE_REIMBURSE;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_LINE_REIMBURSE(java.math.BigDecimal INCOME_LINE_REIMBURSE) {
    this.INCOME_LINE_REIMBURSE = INCOME_LINE_REIMBURSE;
    return this;
  }
  private java.math.BigDecimal INCOME_LINE_CLEAR;
  public java.math.BigDecimal get_INCOME_LINE_CLEAR() {
    return INCOME_LINE_CLEAR;
  }
  public void set_INCOME_LINE_CLEAR(java.math.BigDecimal INCOME_LINE_CLEAR) {
    this.INCOME_LINE_CLEAR = INCOME_LINE_CLEAR;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_LINE_CLEAR(java.math.BigDecimal INCOME_LINE_CLEAR) {
    this.INCOME_LINE_CLEAR = INCOME_LINE_CLEAR;
    return this;
  }
  private java.math.BigDecimal INCOME_AMOUNT;
  public java.math.BigDecimal get_INCOME_AMOUNT() {
    return INCOME_AMOUNT;
  }
  public void set_INCOME_AMOUNT(java.math.BigDecimal INCOME_AMOUNT) {
    this.INCOME_AMOUNT = INCOME_AMOUNT;
  }
  public T71_ACC_FIN_REPORT_YPT with_INCOME_AMOUNT(java.math.BigDecimal INCOME_AMOUNT) {
    this.INCOME_AMOUNT = INCOME_AMOUNT;
    return this;
  }
  private java.math.BigDecimal PAY_LINE_CONSUME_CLEAR;
  public java.math.BigDecimal get_PAY_LINE_CONSUME_CLEAR() {
    return PAY_LINE_CONSUME_CLEAR;
  }
  public void set_PAY_LINE_CONSUME_CLEAR(java.math.BigDecimal PAY_LINE_CONSUME_CLEAR) {
    this.PAY_LINE_CONSUME_CLEAR = PAY_LINE_CONSUME_CLEAR;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_LINE_CONSUME_CLEAR(java.math.BigDecimal PAY_LINE_CONSUME_CLEAR) {
    this.PAY_LINE_CONSUME_CLEAR = PAY_LINE_CONSUME_CLEAR;
    return this;
  }
  private java.math.BigDecimal PAY_LINE_REPARATION_CLEAR;
  public java.math.BigDecimal get_PAY_LINE_REPARATION_CLEAR() {
    return PAY_LINE_REPARATION_CLEAR;
  }
  public void set_PAY_LINE_REPARATION_CLEAR(java.math.BigDecimal PAY_LINE_REPARATION_CLEAR) {
    this.PAY_LINE_REPARATION_CLEAR = PAY_LINE_REPARATION_CLEAR;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_LINE_REPARATION_CLEAR(java.math.BigDecimal PAY_LINE_REPARATION_CLEAR) {
    this.PAY_LINE_REPARATION_CLEAR = PAY_LINE_REPARATION_CLEAR;
    return this;
  }
  private java.math.BigDecimal PAY_LINE_PRE_INCOME_CLEAR;
  public java.math.BigDecimal get_PAY_LINE_PRE_INCOME_CLEAR() {
    return PAY_LINE_PRE_INCOME_CLEAR;
  }
  public void set_PAY_LINE_PRE_INCOME_CLEAR(java.math.BigDecimal PAY_LINE_PRE_INCOME_CLEAR) {
    this.PAY_LINE_PRE_INCOME_CLEAR = PAY_LINE_PRE_INCOME_CLEAR;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_LINE_PRE_INCOME_CLEAR(java.math.BigDecimal PAY_LINE_PRE_INCOME_CLEAR) {
    this.PAY_LINE_PRE_INCOME_CLEAR = PAY_LINE_PRE_INCOME_CLEAR;
    return this;
  }
  private java.math.BigDecimal PAY_LINE_AGENT;
  public java.math.BigDecimal get_PAY_LINE_AGENT() {
    return PAY_LINE_AGENT;
  }
  public void set_PAY_LINE_AGENT(java.math.BigDecimal PAY_LINE_AGENT) {
    this.PAY_LINE_AGENT = PAY_LINE_AGENT;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_LINE_AGENT(java.math.BigDecimal PAY_LINE_AGENT) {
    this.PAY_LINE_AGENT = PAY_LINE_AGENT;
    return this;
  }
  private java.math.BigDecimal PAY_LINE_MANUAL;
  public java.math.BigDecimal get_PAY_LINE_MANUAL() {
    return PAY_LINE_MANUAL;
  }
  public void set_PAY_LINE_MANUAL(java.math.BigDecimal PAY_LINE_MANUAL) {
    this.PAY_LINE_MANUAL = PAY_LINE_MANUAL;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_LINE_MANUAL(java.math.BigDecimal PAY_LINE_MANUAL) {
    this.PAY_LINE_MANUAL = PAY_LINE_MANUAL;
    return this;
  }
  private java.math.BigDecimal PAY_AMOUNT;
  public java.math.BigDecimal get_PAY_AMOUNT() {
    return PAY_AMOUNT;
  }
  public void set_PAY_AMOUNT(java.math.BigDecimal PAY_AMOUNT) {
    this.PAY_AMOUNT = PAY_AMOUNT;
  }
  public T71_ACC_FIN_REPORT_YPT with_PAY_AMOUNT(java.math.BigDecimal PAY_AMOUNT) {
    this.PAY_AMOUNT = PAY_AMOUNT;
    return this;
  }
  private java.math.BigDecimal IMCOME_PAY_NET_AMOUNT;
  public java.math.BigDecimal get_IMCOME_PAY_NET_AMOUNT() {
    return IMCOME_PAY_NET_AMOUNT;
  }
  public void set_IMCOME_PAY_NET_AMOUNT(java.math.BigDecimal IMCOME_PAY_NET_AMOUNT) {
    this.IMCOME_PAY_NET_AMOUNT = IMCOME_PAY_NET_AMOUNT;
  }
  public T71_ACC_FIN_REPORT_YPT with_IMCOME_PAY_NET_AMOUNT(java.math.BigDecimal IMCOME_PAY_NET_AMOUNT) {
    this.IMCOME_PAY_NET_AMOUNT = IMCOME_PAY_NET_AMOUNT;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_ACC_FIN_REPORT_YPT)) {
      return false;
    }
    T71_ACC_FIN_REPORT_YPT that = (T71_ACC_FIN_REPORT_YPT) o;
    boolean equal = true;
    equal = equal && (this.STAT_MON == null ? that.STAT_MON == null : this.STAT_MON.equals(that.STAT_MON));
    equal = equal && (this.ROW_SEQ == null ? that.ROW_SEQ == null : this.ROW_SEQ.equals(that.ROW_SEQ));
    equal = equal && (this.LINE_NME == null ? that.LINE_NME == null : this.LINE_NME.equals(that.LINE_NME));
    equal = equal && (this.INCOME_LINE_SELL == null ? that.INCOME_LINE_SELL == null : this.INCOME_LINE_SELL.equals(that.INCOME_LINE_SELL));
    equal = equal && (this.INCOME_LINE_OFFSET == null ? that.INCOME_LINE_OFFSET == null : this.INCOME_LINE_OFFSET.equals(that.INCOME_LINE_OFFSET));
    equal = equal && (this.INCOME_LINE_REPARATION == null ? that.INCOME_LINE_REPARATION == null : this.INCOME_LINE_REPARATION.equals(that.INCOME_LINE_REPARATION));
    equal = equal && (this.INCOME_LINE_REIMBURSE == null ? that.INCOME_LINE_REIMBURSE == null : this.INCOME_LINE_REIMBURSE.equals(that.INCOME_LINE_REIMBURSE));
    equal = equal && (this.INCOME_LINE_CLEAR == null ? that.INCOME_LINE_CLEAR == null : this.INCOME_LINE_CLEAR.equals(that.INCOME_LINE_CLEAR));
    equal = equal && (this.INCOME_AMOUNT == null ? that.INCOME_AMOUNT == null : this.INCOME_AMOUNT.equals(that.INCOME_AMOUNT));
    equal = equal && (this.PAY_LINE_CONSUME_CLEAR == null ? that.PAY_LINE_CONSUME_CLEAR == null : this.PAY_LINE_CONSUME_CLEAR.equals(that.PAY_LINE_CONSUME_CLEAR));
    equal = equal && (this.PAY_LINE_REPARATION_CLEAR == null ? that.PAY_LINE_REPARATION_CLEAR == null : this.PAY_LINE_REPARATION_CLEAR.equals(that.PAY_LINE_REPARATION_CLEAR));
    equal = equal && (this.PAY_LINE_PRE_INCOME_CLEAR == null ? that.PAY_LINE_PRE_INCOME_CLEAR == null : this.PAY_LINE_PRE_INCOME_CLEAR.equals(that.PAY_LINE_PRE_INCOME_CLEAR));
    equal = equal && (this.PAY_LINE_AGENT == null ? that.PAY_LINE_AGENT == null : this.PAY_LINE_AGENT.equals(that.PAY_LINE_AGENT));
    equal = equal && (this.PAY_LINE_MANUAL == null ? that.PAY_LINE_MANUAL == null : this.PAY_LINE_MANUAL.equals(that.PAY_LINE_MANUAL));
    equal = equal && (this.PAY_AMOUNT == null ? that.PAY_AMOUNT == null : this.PAY_AMOUNT.equals(that.PAY_AMOUNT));
    equal = equal && (this.IMCOME_PAY_NET_AMOUNT == null ? that.IMCOME_PAY_NET_AMOUNT == null : this.IMCOME_PAY_NET_AMOUNT.equals(that.IMCOME_PAY_NET_AMOUNT));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_ACC_FIN_REPORT_YPT)) {
      return false;
    }
    T71_ACC_FIN_REPORT_YPT that = (T71_ACC_FIN_REPORT_YPT) o;
    boolean equal = true;
    equal = equal && (this.STAT_MON == null ? that.STAT_MON == null : this.STAT_MON.equals(that.STAT_MON));
    equal = equal && (this.ROW_SEQ == null ? that.ROW_SEQ == null : this.ROW_SEQ.equals(that.ROW_SEQ));
    equal = equal && (this.LINE_NME == null ? that.LINE_NME == null : this.LINE_NME.equals(that.LINE_NME));
    equal = equal && (this.INCOME_LINE_SELL == null ? that.INCOME_LINE_SELL == null : this.INCOME_LINE_SELL.equals(that.INCOME_LINE_SELL));
    equal = equal && (this.INCOME_LINE_OFFSET == null ? that.INCOME_LINE_OFFSET == null : this.INCOME_LINE_OFFSET.equals(that.INCOME_LINE_OFFSET));
    equal = equal && (this.INCOME_LINE_REPARATION == null ? that.INCOME_LINE_REPARATION == null : this.INCOME_LINE_REPARATION.equals(that.INCOME_LINE_REPARATION));
    equal = equal && (this.INCOME_LINE_REIMBURSE == null ? that.INCOME_LINE_REIMBURSE == null : this.INCOME_LINE_REIMBURSE.equals(that.INCOME_LINE_REIMBURSE));
    equal = equal && (this.INCOME_LINE_CLEAR == null ? that.INCOME_LINE_CLEAR == null : this.INCOME_LINE_CLEAR.equals(that.INCOME_LINE_CLEAR));
    equal = equal && (this.INCOME_AMOUNT == null ? that.INCOME_AMOUNT == null : this.INCOME_AMOUNT.equals(that.INCOME_AMOUNT));
    equal = equal && (this.PAY_LINE_CONSUME_CLEAR == null ? that.PAY_LINE_CONSUME_CLEAR == null : this.PAY_LINE_CONSUME_CLEAR.equals(that.PAY_LINE_CONSUME_CLEAR));
    equal = equal && (this.PAY_LINE_REPARATION_CLEAR == null ? that.PAY_LINE_REPARATION_CLEAR == null : this.PAY_LINE_REPARATION_CLEAR.equals(that.PAY_LINE_REPARATION_CLEAR));
    equal = equal && (this.PAY_LINE_PRE_INCOME_CLEAR == null ? that.PAY_LINE_PRE_INCOME_CLEAR == null : this.PAY_LINE_PRE_INCOME_CLEAR.equals(that.PAY_LINE_PRE_INCOME_CLEAR));
    equal = equal && (this.PAY_LINE_AGENT == null ? that.PAY_LINE_AGENT == null : this.PAY_LINE_AGENT.equals(that.PAY_LINE_AGENT));
    equal = equal && (this.PAY_LINE_MANUAL == null ? that.PAY_LINE_MANUAL == null : this.PAY_LINE_MANUAL.equals(that.PAY_LINE_MANUAL));
    equal = equal && (this.PAY_AMOUNT == null ? that.PAY_AMOUNT == null : this.PAY_AMOUNT.equals(that.PAY_AMOUNT));
    equal = equal && (this.IMCOME_PAY_NET_AMOUNT == null ? that.IMCOME_PAY_NET_AMOUNT == null : this.IMCOME_PAY_NET_AMOUNT.equals(that.IMCOME_PAY_NET_AMOUNT));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STAT_MON = JdbcWritableBridge.readString(1, __dbResults);
    this.ROW_SEQ = JdbcWritableBridge.readString(2, __dbResults);
    this.LINE_NME = JdbcWritableBridge.readString(3, __dbResults);
    this.INCOME_LINE_SELL = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.INCOME_LINE_OFFSET = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.INCOME_LINE_REPARATION = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INCOME_LINE_REIMBURSE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.INCOME_LINE_CLEAR = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.INCOME_AMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.PAY_LINE_CONSUME_CLEAR = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.PAY_LINE_REPARATION_CLEAR = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PAY_LINE_PRE_INCOME_CLEAR = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.PAY_LINE_AGENT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.PAY_LINE_MANUAL = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.PAY_AMOUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.IMCOME_PAY_NET_AMOUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STAT_MON = JdbcWritableBridge.readString(1, __dbResults);
    this.ROW_SEQ = JdbcWritableBridge.readString(2, __dbResults);
    this.LINE_NME = JdbcWritableBridge.readString(3, __dbResults);
    this.INCOME_LINE_SELL = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.INCOME_LINE_OFFSET = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.INCOME_LINE_REPARATION = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INCOME_LINE_REIMBURSE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.INCOME_LINE_CLEAR = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.INCOME_AMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.PAY_LINE_CONSUME_CLEAR = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.PAY_LINE_REPARATION_CLEAR = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PAY_LINE_PRE_INCOME_CLEAR = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.PAY_LINE_AGENT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.PAY_LINE_MANUAL = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.PAY_AMOUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.IMCOME_PAY_NET_AMOUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_SELL, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_OFFSET, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_REPARATION, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_REIMBURSE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_CLEAR, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_AMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_CONSUME_CLEAR, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_REPARATION_CLEAR, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_PRE_INCOME_CLEAR, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_AGENT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_MANUAL, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_AMOUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IMCOME_PAY_NET_AMOUNT, 16 + __off, 3, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STAT_MON, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ROW_SEQ, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LINE_NME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_SELL, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_OFFSET, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_REPARATION, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_REIMBURSE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_LINE_CLEAR, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCOME_AMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_CONSUME_CLEAR, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_REPARATION_CLEAR, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_PRE_INCOME_CLEAR, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_AGENT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_LINE_MANUAL, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_AMOUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IMCOME_PAY_NET_AMOUNT, 16 + __off, 3, __dbStmt);
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
        this.INCOME_LINE_SELL = null;
    } else {
    this.INCOME_LINE_SELL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME_LINE_OFFSET = null;
    } else {
    this.INCOME_LINE_OFFSET = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME_LINE_REPARATION = null;
    } else {
    this.INCOME_LINE_REPARATION = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME_LINE_REIMBURSE = null;
    } else {
    this.INCOME_LINE_REIMBURSE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME_LINE_CLEAR = null;
    } else {
    this.INCOME_LINE_CLEAR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME_AMOUNT = null;
    } else {
    this.INCOME_AMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_LINE_CONSUME_CLEAR = null;
    } else {
    this.PAY_LINE_CONSUME_CLEAR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_LINE_REPARATION_CLEAR = null;
    } else {
    this.PAY_LINE_REPARATION_CLEAR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_LINE_PRE_INCOME_CLEAR = null;
    } else {
    this.PAY_LINE_PRE_INCOME_CLEAR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_LINE_AGENT = null;
    } else {
    this.PAY_LINE_AGENT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_LINE_MANUAL = null;
    } else {
    this.PAY_LINE_MANUAL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_AMOUNT = null;
    } else {
    this.PAY_AMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IMCOME_PAY_NET_AMOUNT = null;
    } else {
    this.IMCOME_PAY_NET_AMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.INCOME_LINE_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_SELL, __dataOut);
    }
    if (null == this.INCOME_LINE_OFFSET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_OFFSET, __dataOut);
    }
    if (null == this.INCOME_LINE_REPARATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_REPARATION, __dataOut);
    }
    if (null == this.INCOME_LINE_REIMBURSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_REIMBURSE, __dataOut);
    }
    if (null == this.INCOME_LINE_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_CLEAR, __dataOut);
    }
    if (null == this.INCOME_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_AMOUNT, __dataOut);
    }
    if (null == this.PAY_LINE_CONSUME_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_CONSUME_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_REPARATION_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_REPARATION_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_PRE_INCOME_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_PRE_INCOME_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_AGENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_AGENT, __dataOut);
    }
    if (null == this.PAY_LINE_MANUAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_MANUAL, __dataOut);
    }
    if (null == this.PAY_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_AMOUNT, __dataOut);
    }
    if (null == this.IMCOME_PAY_NET_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.IMCOME_PAY_NET_AMOUNT, __dataOut);
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
    if (null == this.INCOME_LINE_SELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_SELL, __dataOut);
    }
    if (null == this.INCOME_LINE_OFFSET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_OFFSET, __dataOut);
    }
    if (null == this.INCOME_LINE_REPARATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_REPARATION, __dataOut);
    }
    if (null == this.INCOME_LINE_REIMBURSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_REIMBURSE, __dataOut);
    }
    if (null == this.INCOME_LINE_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_LINE_CLEAR, __dataOut);
    }
    if (null == this.INCOME_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INCOME_AMOUNT, __dataOut);
    }
    if (null == this.PAY_LINE_CONSUME_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_CONSUME_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_REPARATION_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_REPARATION_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_PRE_INCOME_CLEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_PRE_INCOME_CLEAR, __dataOut);
    }
    if (null == this.PAY_LINE_AGENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_AGENT, __dataOut);
    }
    if (null == this.PAY_LINE_MANUAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_LINE_MANUAL, __dataOut);
    }
    if (null == this.PAY_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.PAY_AMOUNT, __dataOut);
    }
    if (null == this.IMCOME_PAY_NET_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.IMCOME_PAY_NET_AMOUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_SELL==null?"\\N":INCOME_LINE_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_OFFSET==null?"\\N":INCOME_LINE_OFFSET.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_REPARATION==null?"\\N":INCOME_LINE_REPARATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_REIMBURSE==null?"\\N":INCOME_LINE_REIMBURSE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_CLEAR==null?"\\N":INCOME_LINE_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_AMOUNT==null?"\\N":INCOME_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_CONSUME_CLEAR==null?"\\N":PAY_LINE_CONSUME_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_REPARATION_CLEAR==null?"\\N":PAY_LINE_REPARATION_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_PRE_INCOME_CLEAR==null?"\\N":PAY_LINE_PRE_INCOME_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_AGENT==null?"\\N":PAY_LINE_AGENT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_MANUAL==null?"\\N":PAY_LINE_MANUAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_AMOUNT==null?"\\N":PAY_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMCOME_PAY_NET_AMOUNT==null?"\\N":IMCOME_PAY_NET_AMOUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_SELL==null?"\\N":INCOME_LINE_SELL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_OFFSET==null?"\\N":INCOME_LINE_OFFSET.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_REPARATION==null?"\\N":INCOME_LINE_REPARATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_REIMBURSE==null?"\\N":INCOME_LINE_REIMBURSE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_LINE_CLEAR==null?"\\N":INCOME_LINE_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME_AMOUNT==null?"\\N":INCOME_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_CONSUME_CLEAR==null?"\\N":PAY_LINE_CONSUME_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_REPARATION_CLEAR==null?"\\N":PAY_LINE_REPARATION_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_PRE_INCOME_CLEAR==null?"\\N":PAY_LINE_PRE_INCOME_CLEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_AGENT==null?"\\N":PAY_LINE_AGENT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_LINE_MANUAL==null?"\\N":PAY_LINE_MANUAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_AMOUNT==null?"\\N":PAY_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMCOME_PAY_NET_AMOUNT==null?"\\N":IMCOME_PAY_NET_AMOUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_SELL = null; } else {
      this.INCOME_LINE_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_OFFSET = null; } else {
      this.INCOME_LINE_OFFSET = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_REPARATION = null; } else {
      this.INCOME_LINE_REPARATION = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_REIMBURSE = null; } else {
      this.INCOME_LINE_REIMBURSE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_CLEAR = null; } else {
      this.INCOME_LINE_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_AMOUNT = null; } else {
      this.INCOME_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_CONSUME_CLEAR = null; } else {
      this.PAY_LINE_CONSUME_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_REPARATION_CLEAR = null; } else {
      this.PAY_LINE_REPARATION_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_PRE_INCOME_CLEAR = null; } else {
      this.PAY_LINE_PRE_INCOME_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_AGENT = null; } else {
      this.PAY_LINE_AGENT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_MANUAL = null; } else {
      this.PAY_LINE_MANUAL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_AMOUNT = null; } else {
      this.PAY_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IMCOME_PAY_NET_AMOUNT = null; } else {
      this.IMCOME_PAY_NET_AMOUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_SELL = null; } else {
      this.INCOME_LINE_SELL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_OFFSET = null; } else {
      this.INCOME_LINE_OFFSET = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_REPARATION = null; } else {
      this.INCOME_LINE_REPARATION = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_REIMBURSE = null; } else {
      this.INCOME_LINE_REIMBURSE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_LINE_CLEAR = null; } else {
      this.INCOME_LINE_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INCOME_AMOUNT = null; } else {
      this.INCOME_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_CONSUME_CLEAR = null; } else {
      this.PAY_LINE_CONSUME_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_REPARATION_CLEAR = null; } else {
      this.PAY_LINE_REPARATION_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_PRE_INCOME_CLEAR = null; } else {
      this.PAY_LINE_PRE_INCOME_CLEAR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_AGENT = null; } else {
      this.PAY_LINE_AGENT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_LINE_MANUAL = null; } else {
      this.PAY_LINE_MANUAL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_AMOUNT = null; } else {
      this.PAY_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IMCOME_PAY_NET_AMOUNT = null; } else {
      this.IMCOME_PAY_NET_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T71_ACC_FIN_REPORT_YPT o = (T71_ACC_FIN_REPORT_YPT) super.clone();
    return o;
  }

  public void clone0(T71_ACC_FIN_REPORT_YPT o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("STAT_MON", this.STAT_MON);
    __sqoop$field_map.put("ROW_SEQ", this.ROW_SEQ);
    __sqoop$field_map.put("LINE_NME", this.LINE_NME);
    __sqoop$field_map.put("INCOME_LINE_SELL", this.INCOME_LINE_SELL);
    __sqoop$field_map.put("INCOME_LINE_OFFSET", this.INCOME_LINE_OFFSET);
    __sqoop$field_map.put("INCOME_LINE_REPARATION", this.INCOME_LINE_REPARATION);
    __sqoop$field_map.put("INCOME_LINE_REIMBURSE", this.INCOME_LINE_REIMBURSE);
    __sqoop$field_map.put("INCOME_LINE_CLEAR", this.INCOME_LINE_CLEAR);
    __sqoop$field_map.put("INCOME_AMOUNT", this.INCOME_AMOUNT);
    __sqoop$field_map.put("PAY_LINE_CONSUME_CLEAR", this.PAY_LINE_CONSUME_CLEAR);
    __sqoop$field_map.put("PAY_LINE_REPARATION_CLEAR", this.PAY_LINE_REPARATION_CLEAR);
    __sqoop$field_map.put("PAY_LINE_PRE_INCOME_CLEAR", this.PAY_LINE_PRE_INCOME_CLEAR);
    __sqoop$field_map.put("PAY_LINE_AGENT", this.PAY_LINE_AGENT);
    __sqoop$field_map.put("PAY_LINE_MANUAL", this.PAY_LINE_MANUAL);
    __sqoop$field_map.put("PAY_AMOUNT", this.PAY_AMOUNT);
    __sqoop$field_map.put("IMCOME_PAY_NET_AMOUNT", this.IMCOME_PAY_NET_AMOUNT);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STAT_MON", this.STAT_MON);
    __sqoop$field_map.put("ROW_SEQ", this.ROW_SEQ);
    __sqoop$field_map.put("LINE_NME", this.LINE_NME);
    __sqoop$field_map.put("INCOME_LINE_SELL", this.INCOME_LINE_SELL);
    __sqoop$field_map.put("INCOME_LINE_OFFSET", this.INCOME_LINE_OFFSET);
    __sqoop$field_map.put("INCOME_LINE_REPARATION", this.INCOME_LINE_REPARATION);
    __sqoop$field_map.put("INCOME_LINE_REIMBURSE", this.INCOME_LINE_REIMBURSE);
    __sqoop$field_map.put("INCOME_LINE_CLEAR", this.INCOME_LINE_CLEAR);
    __sqoop$field_map.put("INCOME_AMOUNT", this.INCOME_AMOUNT);
    __sqoop$field_map.put("PAY_LINE_CONSUME_CLEAR", this.PAY_LINE_CONSUME_CLEAR);
    __sqoop$field_map.put("PAY_LINE_REPARATION_CLEAR", this.PAY_LINE_REPARATION_CLEAR);
    __sqoop$field_map.put("PAY_LINE_PRE_INCOME_CLEAR", this.PAY_LINE_PRE_INCOME_CLEAR);
    __sqoop$field_map.put("PAY_LINE_AGENT", this.PAY_LINE_AGENT);
    __sqoop$field_map.put("PAY_LINE_MANUAL", this.PAY_LINE_MANUAL);
    __sqoop$field_map.put("PAY_AMOUNT", this.PAY_AMOUNT);
    __sqoop$field_map.put("IMCOME_PAY_NET_AMOUNT", this.IMCOME_PAY_NET_AMOUNT);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
