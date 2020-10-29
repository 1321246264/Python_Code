// ORM class for table 'T98_ABN_TRIP_ST_RPT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:43:03 CST 2020
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

public class T98_ABN_TRIP_ST_RPT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Line_ID = (String)value;
      }
    });
    setters.put("Dev_Err_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Dev_Err_Ind = (String)value;
      }
    });
    setters.put("Princ_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Princ_Ind = (String)value;
      }
    });
    setters.put("Stat_Period_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Stat_Period_Cd = (String)value;
      }
    });
    setters.put("Data_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Data_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Off_Line_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Off_Line_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Clear_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Clear_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Skip_Line_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Skip_Line_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Pass_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Pass_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Midway_Retrun_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ABN_TRIP_ST_RPT.this.Midway_Retrun_Cnt = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_ABN_TRIP_ST_RPT() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_ABN_TRIP_ST_RPT with_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T98_ABN_TRIP_ST_RPT with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Dev_Err_Ind;
  public String get_Dev_Err_Ind() {
    return Dev_Err_Ind;
  }
  public void set_Dev_Err_Ind(String Dev_Err_Ind) {
    this.Dev_Err_Ind = Dev_Err_Ind;
  }
  public T98_ABN_TRIP_ST_RPT with_Dev_Err_Ind(String Dev_Err_Ind) {
    this.Dev_Err_Ind = Dev_Err_Ind;
    return this;
  }
  private String Princ_Ind;
  public String get_Princ_Ind() {
    return Princ_Ind;
  }
  public void set_Princ_Ind(String Princ_Ind) {
    this.Princ_Ind = Princ_Ind;
  }
  public T98_ABN_TRIP_ST_RPT with_Princ_Ind(String Princ_Ind) {
    this.Princ_Ind = Princ_Ind;
    return this;
  }
  private String Stat_Period_Cd;
  public String get_Stat_Period_Cd() {
    return Stat_Period_Cd;
  }
  public void set_Stat_Period_Cd(String Stat_Period_Cd) {
    this.Stat_Period_Cd = Stat_Period_Cd;
  }
  public T98_ABN_TRIP_ST_RPT with_Stat_Period_Cd(String Stat_Period_Cd) {
    this.Stat_Period_Cd = Stat_Period_Cd;
    return this;
  }
  private java.sql.Date Data_Dt;
  public java.sql.Date get_Data_Dt() {
    return Data_Dt;
  }
  public void set_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
  }
  public T98_ABN_TRIP_ST_RPT with_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
    return this;
  }
  private java.math.BigDecimal Off_Line_Cnt;
  public java.math.BigDecimal get_Off_Line_Cnt() {
    return Off_Line_Cnt;
  }
  public void set_Off_Line_Cnt(java.math.BigDecimal Off_Line_Cnt) {
    this.Off_Line_Cnt = Off_Line_Cnt;
  }
  public T98_ABN_TRIP_ST_RPT with_Off_Line_Cnt(java.math.BigDecimal Off_Line_Cnt) {
    this.Off_Line_Cnt = Off_Line_Cnt;
    return this;
  }
  private java.math.BigDecimal Clear_Train_Cnt;
  public java.math.BigDecimal get_Clear_Train_Cnt() {
    return Clear_Train_Cnt;
  }
  public void set_Clear_Train_Cnt(java.math.BigDecimal Clear_Train_Cnt) {
    this.Clear_Train_Cnt = Clear_Train_Cnt;
  }
  public T98_ABN_TRIP_ST_RPT with_Clear_Train_Cnt(java.math.BigDecimal Clear_Train_Cnt) {
    this.Clear_Train_Cnt = Clear_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Skip_Line_Cnt;
  public java.math.BigDecimal get_Skip_Line_Cnt() {
    return Skip_Line_Cnt;
  }
  public void set_Skip_Line_Cnt(java.math.BigDecimal Skip_Line_Cnt) {
    this.Skip_Line_Cnt = Skip_Line_Cnt;
  }
  public T98_ABN_TRIP_ST_RPT with_Skip_Line_Cnt(java.math.BigDecimal Skip_Line_Cnt) {
    this.Skip_Line_Cnt = Skip_Line_Cnt;
    return this;
  }
  private java.math.BigDecimal Pass_Train_Cnt;
  public java.math.BigDecimal get_Pass_Train_Cnt() {
    return Pass_Train_Cnt;
  }
  public void set_Pass_Train_Cnt(java.math.BigDecimal Pass_Train_Cnt) {
    this.Pass_Train_Cnt = Pass_Train_Cnt;
  }
  public T98_ABN_TRIP_ST_RPT with_Pass_Train_Cnt(java.math.BigDecimal Pass_Train_Cnt) {
    this.Pass_Train_Cnt = Pass_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Midway_Retrun_Cnt;
  public java.math.BigDecimal get_Midway_Retrun_Cnt() {
    return Midway_Retrun_Cnt;
  }
  public void set_Midway_Retrun_Cnt(java.math.BigDecimal Midway_Retrun_Cnt) {
    this.Midway_Retrun_Cnt = Midway_Retrun_Cnt;
  }
  public T98_ABN_TRIP_ST_RPT with_Midway_Retrun_Cnt(java.math.BigDecimal Midway_Retrun_Cnt) {
    this.Midway_Retrun_Cnt = Midway_Retrun_Cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_ABN_TRIP_ST_RPT)) {
      return false;
    }
    T98_ABN_TRIP_ST_RPT that = (T98_ABN_TRIP_ST_RPT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Dev_Err_Ind == null ? that.Dev_Err_Ind == null : this.Dev_Err_Ind.equals(that.Dev_Err_Ind));
    equal = equal && (this.Princ_Ind == null ? that.Princ_Ind == null : this.Princ_Ind.equals(that.Princ_Ind));
    equal = equal && (this.Stat_Period_Cd == null ? that.Stat_Period_Cd == null : this.Stat_Period_Cd.equals(that.Stat_Period_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Off_Line_Cnt == null ? that.Off_Line_Cnt == null : this.Off_Line_Cnt.equals(that.Off_Line_Cnt));
    equal = equal && (this.Clear_Train_Cnt == null ? that.Clear_Train_Cnt == null : this.Clear_Train_Cnt.equals(that.Clear_Train_Cnt));
    equal = equal && (this.Skip_Line_Cnt == null ? that.Skip_Line_Cnt == null : this.Skip_Line_Cnt.equals(that.Skip_Line_Cnt));
    equal = equal && (this.Pass_Train_Cnt == null ? that.Pass_Train_Cnt == null : this.Pass_Train_Cnt.equals(that.Pass_Train_Cnt));
    equal = equal && (this.Midway_Retrun_Cnt == null ? that.Midway_Retrun_Cnt == null : this.Midway_Retrun_Cnt.equals(that.Midway_Retrun_Cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_ABN_TRIP_ST_RPT)) {
      return false;
    }
    T98_ABN_TRIP_ST_RPT that = (T98_ABN_TRIP_ST_RPT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Dev_Err_Ind == null ? that.Dev_Err_Ind == null : this.Dev_Err_Ind.equals(that.Dev_Err_Ind));
    equal = equal && (this.Princ_Ind == null ? that.Princ_Ind == null : this.Princ_Ind.equals(that.Princ_Ind));
    equal = equal && (this.Stat_Period_Cd == null ? that.Stat_Period_Cd == null : this.Stat_Period_Cd.equals(that.Stat_Period_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Off_Line_Cnt == null ? that.Off_Line_Cnt == null : this.Off_Line_Cnt.equals(that.Off_Line_Cnt));
    equal = equal && (this.Clear_Train_Cnt == null ? that.Clear_Train_Cnt == null : this.Clear_Train_Cnt.equals(that.Clear_Train_Cnt));
    equal = equal && (this.Skip_Line_Cnt == null ? that.Skip_Line_Cnt == null : this.Skip_Line_Cnt.equals(that.Skip_Line_Cnt));
    equal = equal && (this.Pass_Train_Cnt == null ? that.Pass_Train_Cnt == null : this.Pass_Train_Cnt.equals(that.Pass_Train_Cnt));
    equal = equal && (this.Midway_Retrun_Cnt == null ? that.Midway_Retrun_Cnt == null : this.Midway_Retrun_Cnt.equals(that.Midway_Retrun_Cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Dev_Err_Ind = JdbcWritableBridge.readString(3, __dbResults);
    this.Princ_Ind = JdbcWritableBridge.readString(4, __dbResults);
    this.Stat_Period_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(6, __dbResults);
    this.Off_Line_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Clear_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Skip_Line_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Pass_Train_Cnt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Midway_Retrun_Cnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Dev_Err_Ind = JdbcWritableBridge.readString(3, __dbResults);
    this.Princ_Ind = JdbcWritableBridge.readString(4, __dbResults);
    this.Stat_Period_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(6, __dbResults);
    this.Off_Line_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Clear_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Skip_Line_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Pass_Train_Cnt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Midway_Retrun_Cnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
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
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Dev_Err_Ind, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Princ_Ind, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Period_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Off_Line_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Clear_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Skip_Line_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pass_Train_Cnt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Midway_Retrun_Cnt, 11 + __off, 3, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Dev_Err_Ind, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Princ_Ind, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Period_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Off_Line_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Clear_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Skip_Line_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pass_Train_Cnt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Midway_Retrun_Cnt, 11 + __off, 3, __dbStmt);
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
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Dev_Err_Ind = null;
    } else {
    this.Dev_Err_Ind = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Princ_Ind = null;
    } else {
    this.Princ_Ind = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Stat_Period_Cd = null;
    } else {
    this.Stat_Period_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Dt = null;
    } else {
    this.Data_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Off_Line_Cnt = null;
    } else {
    this.Off_Line_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Clear_Train_Cnt = null;
    } else {
    this.Clear_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Skip_Line_Cnt = null;
    } else {
    this.Skip_Line_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Pass_Train_Cnt = null;
    } else {
    this.Pass_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Midway_Retrun_Cnt = null;
    } else {
    this.Midway_Retrun_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Dev_Err_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dev_Err_Ind);
    }
    if (null == this.Princ_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Princ_Ind);
    }
    if (null == this.Stat_Period_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Period_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Off_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Off_Line_Cnt, __dataOut);
    }
    if (null == this.Clear_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Clear_Train_Cnt, __dataOut);
    }
    if (null == this.Skip_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Skip_Line_Cnt, __dataOut);
    }
    if (null == this.Pass_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pass_Train_Cnt, __dataOut);
    }
    if (null == this.Midway_Retrun_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Midway_Retrun_Cnt, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Dev_Err_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dev_Err_Ind);
    }
    if (null == this.Princ_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Princ_Ind);
    }
    if (null == this.Stat_Period_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Period_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Off_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Off_Line_Cnt, __dataOut);
    }
    if (null == this.Clear_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Clear_Train_Cnt, __dataOut);
    }
    if (null == this.Skip_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Skip_Line_Cnt, __dataOut);
    }
    if (null == this.Pass_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pass_Train_Cnt, __dataOut);
    }
    if (null == this.Midway_Retrun_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Midway_Retrun_Cnt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dev_Err_Ind==null?"\\N":Dev_Err_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Princ_Ind==null?"\\N":Princ_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Period_Cd==null?"\\N":Stat_Period_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Off_Line_Cnt==null?"\\N":Off_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Clear_Train_Cnt==null?"\\N":Clear_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Skip_Line_Cnt==null?"\\N":Skip_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pass_Train_Cnt==null?"\\N":Pass_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Midway_Retrun_Cnt==null?"\\N":Midway_Retrun_Cnt.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dev_Err_Ind==null?"\\N":Dev_Err_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Princ_Ind==null?"\\N":Princ_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Period_Cd==null?"\\N":Stat_Period_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Off_Line_Cnt==null?"\\N":Off_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Clear_Train_Cnt==null?"\\N":Clear_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Skip_Line_Cnt==null?"\\N":Skip_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pass_Train_Cnt==null?"\\N":Pass_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Midway_Retrun_Cnt==null?"\\N":Midway_Retrun_Cnt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Dev_Err_Ind = null; } else {
      this.Dev_Err_Ind = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Princ_Ind = null; } else {
      this.Princ_Ind = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Period_Cd = null; } else {
      this.Stat_Period_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Off_Line_Cnt = null; } else {
      this.Off_Line_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Clear_Train_Cnt = null; } else {
      this.Clear_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Skip_Line_Cnt = null; } else {
      this.Skip_Line_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pass_Train_Cnt = null; } else {
      this.Pass_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Midway_Retrun_Cnt = null; } else {
      this.Midway_Retrun_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Dev_Err_Ind = null; } else {
      this.Dev_Err_Ind = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Princ_Ind = null; } else {
      this.Princ_Ind = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Period_Cd = null; } else {
      this.Stat_Period_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Off_Line_Cnt = null; } else {
      this.Off_Line_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Clear_Train_Cnt = null; } else {
      this.Clear_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Skip_Line_Cnt = null; } else {
      this.Skip_Line_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pass_Train_Cnt = null; } else {
      this.Pass_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Midway_Retrun_Cnt = null; } else {
      this.Midway_Retrun_Cnt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_ABN_TRIP_ST_RPT o = (T98_ABN_TRIP_ST_RPT) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_ABN_TRIP_ST_RPT o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Dev_Err_Ind", this.Dev_Err_Ind);
    __sqoop$field_map.put("Princ_Ind", this.Princ_Ind);
    __sqoop$field_map.put("Stat_Period_Cd", this.Stat_Period_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Off_Line_Cnt", this.Off_Line_Cnt);
    __sqoop$field_map.put("Clear_Train_Cnt", this.Clear_Train_Cnt);
    __sqoop$field_map.put("Skip_Line_Cnt", this.Skip_Line_Cnt);
    __sqoop$field_map.put("Pass_Train_Cnt", this.Pass_Train_Cnt);
    __sqoop$field_map.put("Midway_Retrun_Cnt", this.Midway_Retrun_Cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Dev_Err_Ind", this.Dev_Err_Ind);
    __sqoop$field_map.put("Princ_Ind", this.Princ_Ind);
    __sqoop$field_map.put("Stat_Period_Cd", this.Stat_Period_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Off_Line_Cnt", this.Off_Line_Cnt);
    __sqoop$field_map.put("Clear_Train_Cnt", this.Clear_Train_Cnt);
    __sqoop$field_map.put("Skip_Line_Cnt", this.Skip_Line_Cnt);
    __sqoop$field_map.put("Pass_Train_Cnt", this.Pass_Train_Cnt);
    __sqoop$field_map.put("Midway_Retrun_Cnt", this.Midway_Retrun_Cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
