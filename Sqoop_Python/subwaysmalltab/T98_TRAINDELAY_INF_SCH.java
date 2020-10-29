// ORM class for table 'T98_TRAINDELAY_INF_SCH'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 30 14:09:56 CST 2020
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

public class T98_TRAINDELAY_INF_SCH extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Stat_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Stat_Index_Cd = (String)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Line_ID = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("OPR_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.OPR_ID = (String)value;
      }
    });
    setters.put("Train_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Train_Num = (String)value;
      }
    });
    setters.put("Leave_LATER_Segment_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Leave_LATER_Segment_Cd = (String)value;
      }
    });
    setters.put("Arrive_LATER_Segment_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Arrive_LATER_Segment_Cd = (String)value;
      }
    });
    setters.put("Total_LATER_Segment_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Total_LATER_Segment_Cd = (String)value;
      }
    });
    setters.put("Leave_LATER_TM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Leave_LATER_TM = (java.math.BigDecimal)value;
      }
    });
    setters.put("Arrive_LATER_TM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Arrive_LATER_TM = (java.math.BigDecimal)value;
      }
    });
    setters.put("Total_LATER_TM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAINDELAY_INF_SCH.this.Total_LATER_TM = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TRAINDELAY_INF_SCH() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TRAINDELAY_INF_SCH with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_TRAINDELAY_INF_SCH with_Stat_Index_Cd(String Stat_Index_Cd) {
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
  public T98_TRAINDELAY_INF_SCH with_Line_ID(String Line_ID) {
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
  public T98_TRAINDELAY_INF_SCH with_Trip_Drct_Cd(String Trip_Drct_Cd) {
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
  public T98_TRAINDELAY_INF_SCH with_OPR_ID(String OPR_ID) {
    this.OPR_ID = OPR_ID;
    return this;
  }
  private String Train_Num;
  public String get_Train_Num() {
    return Train_Num;
  }
  public void set_Train_Num(String Train_Num) {
    this.Train_Num = Train_Num;
  }
  public T98_TRAINDELAY_INF_SCH with_Train_Num(String Train_Num) {
    this.Train_Num = Train_Num;
    return this;
  }
  private String Leave_LATER_Segment_Cd;
  public String get_Leave_LATER_Segment_Cd() {
    return Leave_LATER_Segment_Cd;
  }
  public void set_Leave_LATER_Segment_Cd(String Leave_LATER_Segment_Cd) {
    this.Leave_LATER_Segment_Cd = Leave_LATER_Segment_Cd;
  }
  public T98_TRAINDELAY_INF_SCH with_Leave_LATER_Segment_Cd(String Leave_LATER_Segment_Cd) {
    this.Leave_LATER_Segment_Cd = Leave_LATER_Segment_Cd;
    return this;
  }
  private String Arrive_LATER_Segment_Cd;
  public String get_Arrive_LATER_Segment_Cd() {
    return Arrive_LATER_Segment_Cd;
  }
  public void set_Arrive_LATER_Segment_Cd(String Arrive_LATER_Segment_Cd) {
    this.Arrive_LATER_Segment_Cd = Arrive_LATER_Segment_Cd;
  }
  public T98_TRAINDELAY_INF_SCH with_Arrive_LATER_Segment_Cd(String Arrive_LATER_Segment_Cd) {
    this.Arrive_LATER_Segment_Cd = Arrive_LATER_Segment_Cd;
    return this;
  }
  private String Total_LATER_Segment_Cd;
  public String get_Total_LATER_Segment_Cd() {
    return Total_LATER_Segment_Cd;
  }
  public void set_Total_LATER_Segment_Cd(String Total_LATER_Segment_Cd) {
    this.Total_LATER_Segment_Cd = Total_LATER_Segment_Cd;
  }
  public T98_TRAINDELAY_INF_SCH with_Total_LATER_Segment_Cd(String Total_LATER_Segment_Cd) {
    this.Total_LATER_Segment_Cd = Total_LATER_Segment_Cd;
    return this;
  }
  private java.math.BigDecimal Leave_LATER_TM;
  public java.math.BigDecimal get_Leave_LATER_TM() {
    return Leave_LATER_TM;
  }
  public void set_Leave_LATER_TM(java.math.BigDecimal Leave_LATER_TM) {
    this.Leave_LATER_TM = Leave_LATER_TM;
  }
  public T98_TRAINDELAY_INF_SCH with_Leave_LATER_TM(java.math.BigDecimal Leave_LATER_TM) {
    this.Leave_LATER_TM = Leave_LATER_TM;
    return this;
  }
  private java.math.BigDecimal Arrive_LATER_TM;
  public java.math.BigDecimal get_Arrive_LATER_TM() {
    return Arrive_LATER_TM;
  }
  public void set_Arrive_LATER_TM(java.math.BigDecimal Arrive_LATER_TM) {
    this.Arrive_LATER_TM = Arrive_LATER_TM;
  }
  public T98_TRAINDELAY_INF_SCH with_Arrive_LATER_TM(java.math.BigDecimal Arrive_LATER_TM) {
    this.Arrive_LATER_TM = Arrive_LATER_TM;
    return this;
  }
  private java.math.BigDecimal Total_LATER_TM;
  public java.math.BigDecimal get_Total_LATER_TM() {
    return Total_LATER_TM;
  }
  public void set_Total_LATER_TM(java.math.BigDecimal Total_LATER_TM) {
    this.Total_LATER_TM = Total_LATER_TM;
  }
  public T98_TRAINDELAY_INF_SCH with_Total_LATER_TM(java.math.BigDecimal Total_LATER_TM) {
    this.Total_LATER_TM = Total_LATER_TM;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAINDELAY_INF_SCH)) {
      return false;
    }
    T98_TRAINDELAY_INF_SCH that = (T98_TRAINDELAY_INF_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.OPR_ID == null ? that.OPR_ID == null : this.OPR_ID.equals(that.OPR_ID));
    equal = equal && (this.Train_Num == null ? that.Train_Num == null : this.Train_Num.equals(that.Train_Num));
    equal = equal && (this.Leave_LATER_Segment_Cd == null ? that.Leave_LATER_Segment_Cd == null : this.Leave_LATER_Segment_Cd.equals(that.Leave_LATER_Segment_Cd));
    equal = equal && (this.Arrive_LATER_Segment_Cd == null ? that.Arrive_LATER_Segment_Cd == null : this.Arrive_LATER_Segment_Cd.equals(that.Arrive_LATER_Segment_Cd));
    equal = equal && (this.Total_LATER_Segment_Cd == null ? that.Total_LATER_Segment_Cd == null : this.Total_LATER_Segment_Cd.equals(that.Total_LATER_Segment_Cd));
    equal = equal && (this.Leave_LATER_TM == null ? that.Leave_LATER_TM == null : this.Leave_LATER_TM.equals(that.Leave_LATER_TM));
    equal = equal && (this.Arrive_LATER_TM == null ? that.Arrive_LATER_TM == null : this.Arrive_LATER_TM.equals(that.Arrive_LATER_TM));
    equal = equal && (this.Total_LATER_TM == null ? that.Total_LATER_TM == null : this.Total_LATER_TM.equals(that.Total_LATER_TM));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAINDELAY_INF_SCH)) {
      return false;
    }
    T98_TRAINDELAY_INF_SCH that = (T98_TRAINDELAY_INF_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.OPR_ID == null ? that.OPR_ID == null : this.OPR_ID.equals(that.OPR_ID));
    equal = equal && (this.Train_Num == null ? that.Train_Num == null : this.Train_Num.equals(that.Train_Num));
    equal = equal && (this.Leave_LATER_Segment_Cd == null ? that.Leave_LATER_Segment_Cd == null : this.Leave_LATER_Segment_Cd.equals(that.Leave_LATER_Segment_Cd));
    equal = equal && (this.Arrive_LATER_Segment_Cd == null ? that.Arrive_LATER_Segment_Cd == null : this.Arrive_LATER_Segment_Cd.equals(that.Arrive_LATER_Segment_Cd));
    equal = equal && (this.Total_LATER_Segment_Cd == null ? that.Total_LATER_Segment_Cd == null : this.Total_LATER_Segment_Cd.equals(that.Total_LATER_Segment_Cd));
    equal = equal && (this.Leave_LATER_TM == null ? that.Leave_LATER_TM == null : this.Leave_LATER_TM.equals(that.Leave_LATER_TM));
    equal = equal && (this.Arrive_LATER_TM == null ? that.Arrive_LATER_TM == null : this.Arrive_LATER_TM.equals(that.Arrive_LATER_TM));
    equal = equal && (this.Total_LATER_TM == null ? that.Total_LATER_TM == null : this.Total_LATER_TM.equals(that.Total_LATER_TM));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.OPR_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.Train_Num = JdbcWritableBridge.readString(6, __dbResults);
    this.Leave_LATER_Segment_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Arrive_LATER_Segment_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Total_LATER_Segment_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Leave_LATER_TM = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Arrive_LATER_TM = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Total_LATER_TM = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.OPR_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.Train_Num = JdbcWritableBridge.readString(6, __dbResults);
    this.Leave_LATER_Segment_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Arrive_LATER_Segment_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Total_LATER_Segment_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Leave_LATER_TM = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Arrive_LATER_TM = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Total_LATER_TM = JdbcWritableBridge.readBigDecimal(12, __dbResults);
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
    JdbcWritableBridge.writeString(Train_Num, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Leave_LATER_Segment_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Arrive_LATER_Segment_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Total_LATER_Segment_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Leave_LATER_TM, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arrive_LATER_TM, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Total_LATER_TM, 12 + __off, 3, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OPR_ID, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Train_Num, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Leave_LATER_Segment_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Arrive_LATER_Segment_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Total_LATER_Segment_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Leave_LATER_TM, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Arrive_LATER_TM, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Total_LATER_TM, 12 + __off, 3, __dbStmt);
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
        this.Train_Num = null;
    } else {
    this.Train_Num = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Leave_LATER_Segment_Cd = null;
    } else {
    this.Leave_LATER_Segment_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arrive_LATER_Segment_Cd = null;
    } else {
    this.Arrive_LATER_Segment_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Total_LATER_Segment_Cd = null;
    } else {
    this.Total_LATER_Segment_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Leave_LATER_TM = null;
    } else {
    this.Leave_LATER_TM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arrive_LATER_TM = null;
    } else {
    this.Arrive_LATER_TM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Total_LATER_TM = null;
    } else {
    this.Total_LATER_TM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Train_Num);
    }
    if (null == this.Leave_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Leave_LATER_Segment_Cd);
    }
    if (null == this.Arrive_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrive_LATER_Segment_Cd);
    }
    if (null == this.Total_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Total_LATER_Segment_Cd);
    }
    if (null == this.Leave_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Leave_LATER_TM, __dataOut);
    }
    if (null == this.Arrive_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arrive_LATER_TM, __dataOut);
    }
    if (null == this.Total_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Total_LATER_TM, __dataOut);
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
    if (null == this.Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Train_Num);
    }
    if (null == this.Leave_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Leave_LATER_Segment_Cd);
    }
    if (null == this.Arrive_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrive_LATER_Segment_Cd);
    }
    if (null == this.Total_LATER_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Total_LATER_Segment_Cd);
    }
    if (null == this.Leave_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Leave_LATER_TM, __dataOut);
    }
    if (null == this.Arrive_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Arrive_LATER_TM, __dataOut);
    }
    if (null == this.Total_LATER_TM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Total_LATER_TM, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Num==null?"\\N":Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_LATER_Segment_Cd==null?"\\N":Leave_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_LATER_Segment_Cd==null?"\\N":Arrive_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_LATER_Segment_Cd==null?"\\N":Total_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_LATER_TM==null?"\\N":Leave_LATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_LATER_TM==null?"\\N":Arrive_LATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_LATER_TM==null?"\\N":Total_LATER_TM.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Num==null?"\\N":Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_LATER_Segment_Cd==null?"\\N":Leave_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_LATER_Segment_Cd==null?"\\N":Arrive_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_LATER_Segment_Cd==null?"\\N":Total_LATER_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Leave_LATER_TM==null?"\\N":Leave_LATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrive_LATER_TM==null?"\\N":Arrive_LATER_TM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_LATER_TM==null?"\\N":Total_LATER_TM.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Train_Num = null; } else {
      this.Train_Num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Leave_LATER_Segment_Cd = null; } else {
      this.Leave_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Arrive_LATER_Segment_Cd = null; } else {
      this.Arrive_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Total_LATER_Segment_Cd = null; } else {
      this.Total_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Leave_LATER_TM = null; } else {
      this.Leave_LATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arrive_LATER_TM = null; } else {
      this.Arrive_LATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Total_LATER_TM = null; } else {
      this.Total_LATER_TM = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Train_Num = null; } else {
      this.Train_Num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Leave_LATER_Segment_Cd = null; } else {
      this.Leave_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Arrive_LATER_Segment_Cd = null; } else {
      this.Arrive_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Total_LATER_Segment_Cd = null; } else {
      this.Total_LATER_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Leave_LATER_TM = null; } else {
      this.Leave_LATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Arrive_LATER_TM = null; } else {
      this.Arrive_LATER_TM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Total_LATER_TM = null; } else {
      this.Total_LATER_TM = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TRAINDELAY_INF_SCH o = (T98_TRAINDELAY_INF_SCH) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TRAINDELAY_INF_SCH o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("OPR_ID", this.OPR_ID);
    __sqoop$field_map.put("Train_Num", this.Train_Num);
    __sqoop$field_map.put("Leave_LATER_Segment_Cd", this.Leave_LATER_Segment_Cd);
    __sqoop$field_map.put("Arrive_LATER_Segment_Cd", this.Arrive_LATER_Segment_Cd);
    __sqoop$field_map.put("Total_LATER_Segment_Cd", this.Total_LATER_Segment_Cd);
    __sqoop$field_map.put("Leave_LATER_TM", this.Leave_LATER_TM);
    __sqoop$field_map.put("Arrive_LATER_TM", this.Arrive_LATER_TM);
    __sqoop$field_map.put("Total_LATER_TM", this.Total_LATER_TM);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("OPR_ID", this.OPR_ID);
    __sqoop$field_map.put("Train_Num", this.Train_Num);
    __sqoop$field_map.put("Leave_LATER_Segment_Cd", this.Leave_LATER_Segment_Cd);
    __sqoop$field_map.put("Arrive_LATER_Segment_Cd", this.Arrive_LATER_Segment_Cd);
    __sqoop$field_map.put("Total_LATER_Segment_Cd", this.Total_LATER_Segment_Cd);
    __sqoop$field_map.put("Leave_LATER_TM", this.Leave_LATER_TM);
    __sqoop$field_map.put("Arrive_LATER_TM", this.Arrive_LATER_TM);
    __sqoop$field_map.put("Total_LATER_TM", this.Total_LATER_TM);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
