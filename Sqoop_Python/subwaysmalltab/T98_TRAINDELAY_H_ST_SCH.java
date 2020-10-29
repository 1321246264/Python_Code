// ORM class for table 'T98_TRAINDELAY_H_ST_SCH'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 30 14:08:22 CST 2020
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

public class T98_TRAINDELAY_H_ST_SCH extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Stat_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Stat_Index_Cd = (String)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Line_ID = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("OPR_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.OPR_ID = (String)value;
      }
    });
    setters.put("St_Delay_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.St_Delay_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Arriv_Delay_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Arriv_Delay_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Delay_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Delay_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Leave_MAXLATER_TM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Leave_MAXLATER_TM = (java.math.BigDecimal)value;
      }
    });
    setters.put("Arrive_MAXLATER_TM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Arrive_MAXLATER_TM = (java.math.BigDecimal)value;
      }
    });
    setters.put("Leave_MAXLATER_TRAIN_NUM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Leave_MAXLATER_TRAIN_NUM = (String)value;
      }
    });
    setters.put("Arrive_MAXLATER_TRAIN_NUM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Arrive_MAXLATER_TRAIN_NUM = (String)value;
      }
    });
    setters.put("Actl_Trip_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_H_ST_SCH.this.Actl_Trip_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TRAINDELAY_H_ST_SCH() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
    return this;
  }
  private String Stat_Index_Cd;
  public String get_Stat_Index_Cd() {
    return Stat_Index_Cd;
  }
  public void set_Stat_Index_Cd(String Stat_Index_Cd) {
    this.Stat_Index_Cd = Stat_Index_Cd;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Stat_Index_Cd(String Stat_Index_Cd) {
    this.Stat_Index_Cd = Stat_Index_Cd;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Trip_Drct_Cd;
  public String get_Trip_Drct_Cd() {
    return Trip_Drct_Cd;
  }
  public void set_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
    return this;
  }
  private String OPR_ID;
  public String get_OPR_ID() {
    return OPR_ID;
  }
  public void set_OPR_ID(String OPR_ID) {
    this.OPR_ID = OPR_ID;
  }
  public T98_TRAINDELAY_H_ST_SCH with_OPR_ID(String OPR_ID) {
    this.OPR_ID = OPR_ID;
    return this;
  }
  private java.math.BigDecimal St_Delay_Train_Cnt;
  public java.math.BigDecimal get_St_Delay_Train_Cnt() {
    return St_Delay_Train_Cnt;
  }
  public void set_St_Delay_Train_Cnt(java.math.BigDecimal St_Delay_Train_Cnt) {
    this.St_Delay_Train_Cnt = St_Delay_Train_Cnt;
  }
  public T98_TRAINDELAY_H_ST_SCH with_St_Delay_Train_Cnt(java.math.BigDecimal St_Delay_Train_Cnt) {
    this.St_Delay_Train_Cnt = St_Delay_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Arriv_Delay_Train_Cnt;
  public java.math.BigDecimal get_Arriv_Delay_Train_Cnt() {
    return Arriv_Delay_Train_Cnt;
  }
  public void set_Arriv_Delay_Train_Cnt(java.math.BigDecimal Arriv_Delay_Train_Cnt) {
    this.Arriv_Delay_Train_Cnt = Arriv_Delay_Train_Cnt;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Arriv_Delay_Train_Cnt(java.math.BigDecimal Arriv_Delay_Train_Cnt) {
    this.Arriv_Delay_Train_Cnt = Arriv_Delay_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Delay_Train_Cnt;
  public java.math.BigDecimal get_Delay_Train_Cnt() {
    return Delay_Train_Cnt;
  }
  public void set_Delay_Train_Cnt(java.math.BigDecimal Delay_Train_Cnt) {
    this.Delay_Train_Cnt = Delay_Train_Cnt;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Delay_Train_Cnt(java.math.BigDecimal Delay_Train_Cnt) {
    this.Delay_Train_Cnt = Delay_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Leave_MAXLATER_TM;
  public java.math.BigDecimal get_Leave_MAXLATER_TM() {
    return Leave_MAXLATER_TM;
  }
  public void set_Leave_MAXLATER_TM(java.math.BigDecimal Leave_MAXLATER_TM) {
    this.Leave_MAXLATER_TM = Leave_MAXLATER_TM;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Leave_MAXLATER_TM(java.math.BigDecimal Leave_MAXLATER_TM) {
    this.Leave_MAXLATER_TM = Leave_MAXLATER_TM;
    return this;
  }
  private java.math.BigDecimal Arrive_MAXLATER_TM;
  public java.math.BigDecimal get_Arrive_MAXLATER_TM() {
    return Arrive_MAXLATER_TM;
  }
  public void set_Arrive_MAXLATER_TM(java.math.BigDecimal Arrive_MAXLATER_TM) {
    this.Arrive_MAXLATER_TM = Arrive_MAXLATER_TM;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Arrive_MAXLATER_TM(java.math.BigDecimal Arrive_MAXLATER_TM) {
    this.Arrive_MAXLATER_TM = Arrive_MAXLATER_TM;
    return this;
  }
  private String Leave_MAXLATER_TRAIN_NUM;
  public String get_Leave_MAXLATER_TRAIN_NUM() {
    return Leave_MAXLATER_TRAIN_NUM;
  }
  public void set_Leave_MAXLATER_TRAIN_NUM(String Leave_MAXLATER_TRAIN_NUM) {
    this.Leave_MAXLATER_TRAIN_NUM = Leave_MAXLATER_TRAIN_NUM;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Leave_MAXLATER_TRAIN_NUM(String Leave_MAXLATER_TRAIN_NUM) {
    this.Leave_MAXLATER_TRAIN_NUM = Leave_MAXLATER_TRAIN_NUM;
    return this;
  }
  private String Arrive_MAXLATER_TRAIN_NUM;
  public String get_Arrive_MAXLATER_TRAIN_NUM() {
    return Arrive_MAXLATER_TRAIN_NUM;
  }
  public void set_Arrive_MAXLATER_TRAIN_NUM(String Arrive_MAXLATER_TRAIN_NUM) {
    this.Arrive_MAXLATER_TRAIN_NUM = Arrive_MAXLATER_TRAIN_NUM;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Arrive_MAXLATER_TRAIN_NUM(String Arrive_MAXLATER_TRAIN_NUM) {
    this.Arrive_MAXLATER_TRAIN_NUM = Arrive_MAXLATER_TRAIN_NUM;
    return this;
  }
  private java.math.BigDecimal Actl_Trip_Train_Cnt;
  public java.math.BigDecimal get_Actl_Trip_Train_Cnt() {
    return Actl_Trip_Train_Cnt;
  }
  public void set_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
  }
  public T98_TRAINDELAY_H_ST_SCH with_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAINDELAY_H_ST_SCH)) {
      return false;
    }
    T98_TRAINDELAY_H_ST_SCH that = (T98_TRAINDELAY_H_ST_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.OPR_ID == null ? that.OPR_ID == null : this.OPR_ID.equals(that.OPR_ID));
    equal = equal && (this.St_Delay_Train_Cnt == null ? that.St_Delay_Train_Cnt == null : this.St_Delay_Train_Cnt.equals(that.St_Delay_Train_Cnt));
    equal = equal && (this.Arriv_Delay_Train_Cnt == null ? that.Arriv_Delay_Train_Cnt == null : this.Arriv_Delay_Train_Cnt.equals(that.Arriv_Delay_Train_Cnt));
    equal = equal && (this.Delay_Train_Cnt == null ? that.Delay_Train_Cnt == null : this.Delay_Train_Cnt.equals(that.Delay_Train_Cnt));
    equal = equal && (this.Leave_MAXLATER_TM == null ? that.Leave_MAXLATER_TM == null : this.Leave_MAXLATER_TM.equals(that.Leave_MAXLATER_TM));
    equal = equal && (this.Arrive_MAXLATER_TM == null ? that.Arrive_MAXLATER_TM == null : this.Arrive_MAXLATER_TM.equals(that.Arrive_MAXLATER_TM));
    equal = equal && (this.Leave_MAXLATER_TRAIN_NUM == null ? that.Leave_MAXLATER_TRAIN_NUM == null : this.Leave_MAXLATER_TRAIN_NUM.equals(that.Leave_MAXLATER_TRAIN_NUM));
    equal = equal && (this.Arrive_MAXLATER_TRAIN_NUM == null ? that.Arrive_MAXLATER_TRAIN_NUM == null : this.Arrive_MAXLATER_TRAIN_NUM.equals(that.Arrive_MAXLATER_TRAIN_NUM));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAINDELAY_H_ST_SCH)) {
      return false;
    }
    T98_TRAINDELAY_H_ST_SCH that = (T98_TRAINDELAY_H_ST_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.OPR_ID == null ? that.OPR_ID == null : this.OPR_ID.equals(that.OPR_ID));
    equal = equal && (this.St_Delay_Train_Cnt == null ? that.St_Delay_Train_Cnt == null : this.St_Delay_Train_Cnt.equals(that.St_Delay_Train_Cnt));
    equal = equal && (this.Arriv_Delay_Train_Cnt == null ? that.Arriv_Delay_Train_Cnt == null : this.Arriv_Delay_Train_Cnt.equals(that.Arriv_Delay_Train_Cnt));
    equal = equal && (this.Delay_Train_Cnt == null ? that.Delay_Train_Cnt == null : this.Delay_Train_Cnt.equals(that.Delay_Train_Cnt));
    equal = equal && (this.Leave_MAXLATER_TM == null ? that.Leave_MAXLATER_TM == null : this.Leave_MAXLATER_TM.equals(that.Leave_MAXLATER_TM));
    equal = equal && (this.Arrive_MAXLATER_TM == null ? that.Arrive_MAXLATER_TM == null : this.Arrive_MAXLATER_TM.equals(that.Arrive_MAXLATER_TM));
    equal = equal && (this.Leave_MAXLATER_TRAIN_NUM == null ? that.Leave_MAXLATER_TRAIN_NUM == null : this.Leave_MAXLATER_TRAIN_NUM.equals(that.Leave_MAXLATER_TRAIN_NUM));
    equal = equal && (this.Arrive_MAXLATER_TRAIN_NUM == null ? that.Arrive_MAXLATER_TRAIN_NUM == null : this.Arrive_MAXLATER_TRAIN_NUM.equals(that.Arrive_MAXLATER_TRAIN_NUM));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.OPR_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.St_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Arriv_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Leave_MAXLATER_TM = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Arrive_MAXLATER_TM = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Leave_MAXLATER_TRAIN_NUM = JdbcWritableBridge.readString(11, __dbResults);
    this.Arrive_MAXLATER_TRAIN_NUM = JdbcWritableBridge.readString(12, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.OPR_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.St_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Arriv_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Leave_MAXLATER_TM = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Arrive_MAXLATER_TM = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Leave_MAXLATER_TRAIN_NUM = JdbcWritableBridge.readString(11, __dbResults);
    this.Arrive_MAXLATER_TRAIN_NUM = JdbcWritableBridge.readString(12, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
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
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OPR_ID, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(St_Delay_Train_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arriv_Delay_Train_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Delay_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Leave_MAXLATER_TM, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arrive_MAXLATER_TM, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Leave_MAXLATER_TRAIN_NUM, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Arrive_MAXLATER_TRAIN_NUM, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 13 + __off, 3, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OPR_ID, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(St_Delay_Train_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arriv_Delay_Train_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Delay_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Leave_MAXLATER_TM, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arrive_MAXLATER_TM, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Leave_MAXLATER_TRAIN_NUM, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Arrive_MAXLATER_TRAIN_NUM, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 13 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Stat_Dt = null;
    } else {
    this.Stat_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Stat_Index_Cd = null;
    } else {
    this.Stat_Index_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Trip_Drct_Cd = null;
    } else {
    this.Trip_Drct_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPR_ID = null;
    } else {
    this.OPR_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.St_Delay_Train_Cnt = null;
    } else {
    this.St_Delay_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arriv_Delay_Train_Cnt = null;
    } else {
    this.Arriv_Delay_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Delay_Train_Cnt = null;
    } else {
    this.Delay_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Leave_MAXLATER_TM = null;
    } else {
    this.Leave_MAXLATER_TM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arrive_MAXLATER_TM = null;
    } else {
    this.Arrive_MAXLATER_TM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Leave_MAXLATER_TRAIN_NUM = null;
    } else {
    this.Leave_MAXLATER_TRAIN_NUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arrive_MAXLATER_TRAIN_NUM = null;
    } else {
    this.Arrive_MAXLATER_TRAIN_NUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Actl_Trip_Train_Cnt = null;
    } else {
    this.Actl_Trip_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Stat_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
    }
    if (null == this.OPR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPR_ID);
    }
    if (null == this.St_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.St_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Arriv_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arriv_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Leave_MAXLATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Leave_MAXLATER_TM, __dataOut);
    }
    if (null == this.Arrive_MAXLATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arrive_MAXLATER_TM, __dataOut);
    }
    if (null == this.Leave_MAXLATER_TRAIN_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Leave_MAXLATER_TRAIN_NUM);
    }
    if (null == this.Arrive_MAXLATER_TRAIN_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrive_MAXLATER_TRAIN_NUM);
    }
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Stat_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
    }
    if (null == this.OPR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPR_ID);
    }
    if (null == this.St_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.St_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Arriv_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arriv_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Leave_MAXLATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Leave_MAXLATER_TM, __dataOut);
    }
    if (null == this.Arrive_MAXLATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arrive_MAXLATER_TM, __dataOut);
    }
    if (null == this.Leave_MAXLATER_TRAIN_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Leave_MAXLATER_TRAIN_NUM);
    }
    if (null == this.Arrive_MAXLATER_TRAIN_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrive_MAXLATER_TRAIN_NUM);
    }
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Cd==null?"\\N":Stat_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPR_ID==null?"\\N":OPR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(St_Delay_Train_Cnt==null?"\\N":St_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arriv_Delay_Train_Cnt==null?"\\N":Arriv_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Delay_Train_Cnt==null?"\\N":Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_MAXLATER_TM==null?"\\N":Leave_MAXLATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_MAXLATER_TM==null?"\\N":Arrive_MAXLATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_MAXLATER_TRAIN_NUM==null?"\\N":Leave_MAXLATER_TRAIN_NUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_MAXLATER_TRAIN_NUM==null?"\\N":Arrive_MAXLATER_TRAIN_NUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Cd==null?"\\N":Stat_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPR_ID==null?"\\N":OPR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(St_Delay_Train_Cnt==null?"\\N":St_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arriv_Delay_Train_Cnt==null?"\\N":Arriv_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Delay_Train_Cnt==null?"\\N":Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_MAXLATER_TM==null?"\\N":Leave_MAXLATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_MAXLATER_TM==null?"\\N":Arrive_MAXLATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_MAXLATER_TRAIN_NUM==null?"\\N":Leave_MAXLATER_TRAIN_NUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_MAXLATER_TRAIN_NUM==null?"\\N":Arrive_MAXLATER_TRAIN_NUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Stat_Dt = null; } else {
      this.Stat_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Index_Cd = null; } else {
      this.Stat_Index_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Trip_Drct_Cd = null; } else {
      this.Trip_Drct_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OPR_ID = null; } else {
      this.OPR_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.St_Delay_Train_Cnt = null; } else {
      this.St_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arriv_Delay_Train_Cnt = null; } else {
      this.Arriv_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Delay_Train_Cnt = null; } else {
      this.Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Leave_MAXLATER_TM = null; } else {
      this.Leave_MAXLATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arrive_MAXLATER_TM = null; } else {
      this.Arrive_MAXLATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Leave_MAXLATER_TRAIN_NUM = null; } else {
      this.Leave_MAXLATER_TRAIN_NUM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Arrive_MAXLATER_TRAIN_NUM = null; } else {
      this.Arrive_MAXLATER_TRAIN_NUM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Stat_Dt = null; } else {
      this.Stat_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Index_Cd = null; } else {
      this.Stat_Index_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Trip_Drct_Cd = null; } else {
      this.Trip_Drct_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OPR_ID = null; } else {
      this.OPR_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.St_Delay_Train_Cnt = null; } else {
      this.St_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arriv_Delay_Train_Cnt = null; } else {
      this.Arriv_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Delay_Train_Cnt = null; } else {
      this.Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Leave_MAXLATER_TM = null; } else {
      this.Leave_MAXLATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arrive_MAXLATER_TM = null; } else {
      this.Arrive_MAXLATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Leave_MAXLATER_TRAIN_NUM = null; } else {
      this.Leave_MAXLATER_TRAIN_NUM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Arrive_MAXLATER_TRAIN_NUM = null; } else {
      this.Arrive_MAXLATER_TRAIN_NUM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TRAINDELAY_H_ST_SCH o = (T98_TRAINDELAY_H_ST_SCH) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TRAINDELAY_H_ST_SCH o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("OPR_ID", this.OPR_ID);
    __sqoop$field_map.put("St_Delay_Train_Cnt", this.St_Delay_Train_Cnt);
    __sqoop$field_map.put("Arriv_Delay_Train_Cnt", this.Arriv_Delay_Train_Cnt);
    __sqoop$field_map.put("Delay_Train_Cnt", this.Delay_Train_Cnt);
    __sqoop$field_map.put("Leave_MAXLATER_TM", this.Leave_MAXLATER_TM);
    __sqoop$field_map.put("Arrive_MAXLATER_TM", this.Arrive_MAXLATER_TM);
    __sqoop$field_map.put("Leave_MAXLATER_TRAIN_NUM", this.Leave_MAXLATER_TRAIN_NUM);
    __sqoop$field_map.put("Arrive_MAXLATER_TRAIN_NUM", this.Arrive_MAXLATER_TRAIN_NUM);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("OPR_ID", this.OPR_ID);
    __sqoop$field_map.put("St_Delay_Train_Cnt", this.St_Delay_Train_Cnt);
    __sqoop$field_map.put("Arriv_Delay_Train_Cnt", this.Arriv_Delay_Train_Cnt);
    __sqoop$field_map.put("Delay_Train_Cnt", this.Delay_Train_Cnt);
    __sqoop$field_map.put("Leave_MAXLATER_TM", this.Leave_MAXLATER_TM);
    __sqoop$field_map.put("Arrive_MAXLATER_TM", this.Arrive_MAXLATER_TM);
    __sqoop$field_map.put("Leave_MAXLATER_TRAIN_NUM", this.Leave_MAXLATER_TRAIN_NUM);
    __sqoop$field_map.put("Arrive_MAXLATER_TRAIN_NUM", this.Arrive_MAXLATER_TRAIN_NUM);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
