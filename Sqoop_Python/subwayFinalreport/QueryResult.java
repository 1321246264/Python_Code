// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jul 22 13:25:34 CST 2020
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

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Stat_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Stat_Index_Cd = (String)value;
      }
    });
    setters.put("Stat_Index_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Stat_Index_Type_Cd = (String)value;
      }
    });
    setters.put("Prod_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Prod_ID = (String)value;
      }
    });
    setters.put("OD_Entry_Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OD_Entry_Station_ID = (String)value;
      }
    });
    setters.put("OD_Entry_Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OD_Entry_Line_ID = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("Ride_Mnt_Segment_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Ride_Mnt_Segment_Cd = (String)value;
      }
    });
    setters.put("Data_Stat_Std_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Data_Stat_Std_Cd = (String)value;
      }
    });
    setters.put("Data_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Data_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Ride_Mnt_Seg_Pcnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Ride_Mnt_Seg_Pcnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Tour_Mnt_Seg_Pcnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Tour_Mnt_Seg_Pcnt = (java.math.BigDecimal)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public QueryResult with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public QueryResult with_Stat_Index_Cd(String Stat_Index_Cd) {
    this.Stat_Index_Cd = Stat_Index_Cd;
    return this;
  }
  private String Stat_Index_Type_Cd;
  public String get_Stat_Index_Type_Cd() {
    return Stat_Index_Type_Cd;
  }
  public void set_Stat_Index_Type_Cd(String Stat_Index_Type_Cd) {
    this.Stat_Index_Type_Cd = Stat_Index_Type_Cd;
  }
  public QueryResult with_Stat_Index_Type_Cd(String Stat_Index_Type_Cd) {
    this.Stat_Index_Type_Cd = Stat_Index_Type_Cd;
    return this;
  }
  private String Prod_ID;
  public String get_Prod_ID() {
    return Prod_ID;
  }
  public void set_Prod_ID(String Prod_ID) {
    this.Prod_ID = Prod_ID;
  }
  public QueryResult with_Prod_ID(String Prod_ID) {
    this.Prod_ID = Prod_ID;
    return this;
  }
  private String OD_Entry_Station_ID;
  public String get_OD_Entry_Station_ID() {
    return OD_Entry_Station_ID;
  }
  public void set_OD_Entry_Station_ID(String OD_Entry_Station_ID) {
    this.OD_Entry_Station_ID = OD_Entry_Station_ID;
  }
  public QueryResult with_OD_Entry_Station_ID(String OD_Entry_Station_ID) {
    this.OD_Entry_Station_ID = OD_Entry_Station_ID;
    return this;
  }
  private String OD_Entry_Line_ID;
  public String get_OD_Entry_Line_ID() {
    return OD_Entry_Line_ID;
  }
  public void set_OD_Entry_Line_ID(String OD_Entry_Line_ID) {
    this.OD_Entry_Line_ID = OD_Entry_Line_ID;
  }
  public QueryResult with_OD_Entry_Line_ID(String OD_Entry_Line_ID) {
    this.OD_Entry_Line_ID = OD_Entry_Line_ID;
    return this;
  }
  private String Trip_Drct_Cd;
  public String get_Trip_Drct_Cd() {
    return Trip_Drct_Cd;
  }
  public void set_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
  }
  public QueryResult with_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
    return this;
  }
  private String Ride_Mnt_Segment_Cd;
  public String get_Ride_Mnt_Segment_Cd() {
    return Ride_Mnt_Segment_Cd;
  }
  public void set_Ride_Mnt_Segment_Cd(String Ride_Mnt_Segment_Cd) {
    this.Ride_Mnt_Segment_Cd = Ride_Mnt_Segment_Cd;
  }
  public QueryResult with_Ride_Mnt_Segment_Cd(String Ride_Mnt_Segment_Cd) {
    this.Ride_Mnt_Segment_Cd = Ride_Mnt_Segment_Cd;
    return this;
  }
  private String Data_Stat_Std_Cd;
  public String get_Data_Stat_Std_Cd() {
    return Data_Stat_Std_Cd;
  }
  public void set_Data_Stat_Std_Cd(String Data_Stat_Std_Cd) {
    this.Data_Stat_Std_Cd = Data_Stat_Std_Cd;
  }
  public QueryResult with_Data_Stat_Std_Cd(String Data_Stat_Std_Cd) {
    this.Data_Stat_Std_Cd = Data_Stat_Std_Cd;
    return this;
  }
  private java.sql.Date Data_Dt;
  public java.sql.Date get_Data_Dt() {
    return Data_Dt;
  }
  public void set_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
  }
  public QueryResult with_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
    return this;
  }
  private java.math.BigDecimal Ride_Mnt_Seg_Pcnt;
  public java.math.BigDecimal get_Ride_Mnt_Seg_Pcnt() {
    return Ride_Mnt_Seg_Pcnt;
  }
  public void set_Ride_Mnt_Seg_Pcnt(java.math.BigDecimal Ride_Mnt_Seg_Pcnt) {
    this.Ride_Mnt_Seg_Pcnt = Ride_Mnt_Seg_Pcnt;
  }
  public QueryResult with_Ride_Mnt_Seg_Pcnt(java.math.BigDecimal Ride_Mnt_Seg_Pcnt) {
    this.Ride_Mnt_Seg_Pcnt = Ride_Mnt_Seg_Pcnt;
    return this;
  }
  private java.math.BigDecimal Tour_Mnt_Seg_Pcnt;
  public java.math.BigDecimal get_Tour_Mnt_Seg_Pcnt() {
    return Tour_Mnt_Seg_Pcnt;
  }
  public void set_Tour_Mnt_Seg_Pcnt(java.math.BigDecimal Tour_Mnt_Seg_Pcnt) {
    this.Tour_Mnt_Seg_Pcnt = Tour_Mnt_Seg_Pcnt;
  }
  public QueryResult with_Tour_Mnt_Seg_Pcnt(java.math.BigDecimal Tour_Mnt_Seg_Pcnt) {
    this.Tour_Mnt_Seg_Pcnt = Tour_Mnt_Seg_Pcnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Stat_Index_Type_Cd == null ? that.Stat_Index_Type_Cd == null : this.Stat_Index_Type_Cd.equals(that.Stat_Index_Type_Cd));
    equal = equal && (this.Prod_ID == null ? that.Prod_ID == null : this.Prod_ID.equals(that.Prod_ID));
    equal = equal && (this.OD_Entry_Station_ID == null ? that.OD_Entry_Station_ID == null : this.OD_Entry_Station_ID.equals(that.OD_Entry_Station_ID));
    equal = equal && (this.OD_Entry_Line_ID == null ? that.OD_Entry_Line_ID == null : this.OD_Entry_Line_ID.equals(that.OD_Entry_Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Ride_Mnt_Segment_Cd == null ? that.Ride_Mnt_Segment_Cd == null : this.Ride_Mnt_Segment_Cd.equals(that.Ride_Mnt_Segment_Cd));
    equal = equal && (this.Data_Stat_Std_Cd == null ? that.Data_Stat_Std_Cd == null : this.Data_Stat_Std_Cd.equals(that.Data_Stat_Std_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Ride_Mnt_Seg_Pcnt == null ? that.Ride_Mnt_Seg_Pcnt == null : this.Ride_Mnt_Seg_Pcnt.equals(that.Ride_Mnt_Seg_Pcnt));
    equal = equal && (this.Tour_Mnt_Seg_Pcnt == null ? that.Tour_Mnt_Seg_Pcnt == null : this.Tour_Mnt_Seg_Pcnt.equals(that.Tour_Mnt_Seg_Pcnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Stat_Index_Type_Cd == null ? that.Stat_Index_Type_Cd == null : this.Stat_Index_Type_Cd.equals(that.Stat_Index_Type_Cd));
    equal = equal && (this.Prod_ID == null ? that.Prod_ID == null : this.Prod_ID.equals(that.Prod_ID));
    equal = equal && (this.OD_Entry_Station_ID == null ? that.OD_Entry_Station_ID == null : this.OD_Entry_Station_ID.equals(that.OD_Entry_Station_ID));
    equal = equal && (this.OD_Entry_Line_ID == null ? that.OD_Entry_Line_ID == null : this.OD_Entry_Line_ID.equals(that.OD_Entry_Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Ride_Mnt_Segment_Cd == null ? that.Ride_Mnt_Segment_Cd == null : this.Ride_Mnt_Segment_Cd.equals(that.Ride_Mnt_Segment_Cd));
    equal = equal && (this.Data_Stat_Std_Cd == null ? that.Data_Stat_Std_Cd == null : this.Data_Stat_Std_Cd.equals(that.Data_Stat_Std_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Ride_Mnt_Seg_Pcnt == null ? that.Ride_Mnt_Seg_Pcnt == null : this.Ride_Mnt_Seg_Pcnt.equals(that.Ride_Mnt_Seg_Pcnt));
    equal = equal && (this.Tour_Mnt_Seg_Pcnt == null ? that.Tour_Mnt_Seg_Pcnt == null : this.Tour_Mnt_Seg_Pcnt.equals(that.Tour_Mnt_Seg_Pcnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Stat_Index_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Prod_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.OD_Entry_Station_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.OD_Entry_Line_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Ride_Mnt_Segment_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Data_Stat_Std_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.Ride_Mnt_Seg_Pcnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Tour_Mnt_Seg_Pcnt = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Stat_Index_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Prod_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.OD_Entry_Station_ID = JdbcWritableBridge.readString(5, __dbResults);
    this.OD_Entry_Line_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Ride_Mnt_Segment_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Data_Stat_Std_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.Ride_Mnt_Seg_Pcnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Tour_Mnt_Seg_Pcnt = JdbcWritableBridge.readBigDecimal(12, __dbResults);
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
    JdbcWritableBridge.writeString(Stat_Index_Type_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Prod_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_Entry_Station_ID, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_Entry_Line_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Ride_Mnt_Segment_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Data_Stat_Std_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Ride_Mnt_Seg_Pcnt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Tour_Mnt_Seg_Pcnt, 12 + __off, 3, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Type_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Prod_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_Entry_Station_ID, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_Entry_Line_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Ride_Mnt_Segment_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Data_Stat_Std_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Ride_Mnt_Seg_Pcnt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Tour_Mnt_Seg_Pcnt, 12 + __off, 3, __dbStmt);
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
        this.Stat_Index_Type_Cd = null;
    } else {
    this.Stat_Index_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Prod_ID = null;
    } else {
    this.Prod_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OD_Entry_Station_ID = null;
    } else {
    this.OD_Entry_Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OD_Entry_Line_ID = null;
    } else {
    this.OD_Entry_Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Trip_Drct_Cd = null;
    } else {
    this.Trip_Drct_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Ride_Mnt_Segment_Cd = null;
    } else {
    this.Ride_Mnt_Segment_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Stat_Std_Cd = null;
    } else {
    this.Data_Stat_Std_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Dt = null;
    } else {
    this.Data_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Ride_Mnt_Seg_Pcnt = null;
    } else {
    this.Ride_Mnt_Seg_Pcnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tour_Mnt_Seg_Pcnt = null;
    } else {
    this.Tour_Mnt_Seg_Pcnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Stat_Index_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Type_Cd);
    }
    if (null == this.Prod_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_ID);
    }
    if (null == this.OD_Entry_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_Entry_Station_ID);
    }
    if (null == this.OD_Entry_Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_Entry_Line_ID);
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
    }
    if (null == this.Ride_Mnt_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ride_Mnt_Segment_Cd);
    }
    if (null == this.Data_Stat_Std_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Data_Stat_Std_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Ride_Mnt_Seg_Pcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Ride_Mnt_Seg_Pcnt, __dataOut);
    }
    if (null == this.Tour_Mnt_Seg_Pcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Tour_Mnt_Seg_Pcnt, __dataOut);
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
    if (null == this.Stat_Index_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Type_Cd);
    }
    if (null == this.Prod_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_ID);
    }
    if (null == this.OD_Entry_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_Entry_Station_ID);
    }
    if (null == this.OD_Entry_Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_Entry_Line_ID);
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
    }
    if (null == this.Ride_Mnt_Segment_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ride_Mnt_Segment_Cd);
    }
    if (null == this.Data_Stat_Std_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Data_Stat_Std_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Ride_Mnt_Seg_Pcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Ride_Mnt_Seg_Pcnt, __dataOut);
    }
    if (null == this.Tour_Mnt_Seg_Pcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Tour_Mnt_Seg_Pcnt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Type_Cd==null?"\\N":Stat_Index_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_ID==null?"\\N":Prod_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_Entry_Station_ID==null?"\\N":OD_Entry_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_Entry_Line_ID==null?"\\N":OD_Entry_Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ride_Mnt_Segment_Cd==null?"\\N":Ride_Mnt_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Stat_Std_Cd==null?"\\N":Data_Stat_Std_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ride_Mnt_Seg_Pcnt==null?"\\N":Ride_Mnt_Seg_Pcnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tour_Mnt_Seg_Pcnt==null?"\\N":Tour_Mnt_Seg_Pcnt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Type_Cd==null?"\\N":Stat_Index_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_ID==null?"\\N":Prod_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_Entry_Station_ID==null?"\\N":OD_Entry_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_Entry_Line_ID==null?"\\N":OD_Entry_Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ride_Mnt_Segment_Cd==null?"\\N":Ride_Mnt_Segment_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Stat_Std_Cd==null?"\\N":Data_Stat_Std_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ride_Mnt_Seg_Pcnt==null?"\\N":Ride_Mnt_Seg_Pcnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tour_Mnt_Seg_Pcnt==null?"\\N":Tour_Mnt_Seg_Pcnt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Stat_Index_Type_Cd = null; } else {
      this.Stat_Index_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_ID = null; } else {
      this.Prod_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_Entry_Station_ID = null; } else {
      this.OD_Entry_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_Entry_Line_ID = null; } else {
      this.OD_Entry_Line_ID = __cur_str;
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
    if (__cur_str.equals("null")) { this.Ride_Mnt_Segment_Cd = null; } else {
      this.Ride_Mnt_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Data_Stat_Std_Cd = null; } else {
      this.Data_Stat_Std_Cd = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ride_Mnt_Seg_Pcnt = null; } else {
      this.Ride_Mnt_Seg_Pcnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tour_Mnt_Seg_Pcnt = null; } else {
      this.Tour_Mnt_Seg_Pcnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Stat_Index_Type_Cd = null; } else {
      this.Stat_Index_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_ID = null; } else {
      this.Prod_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_Entry_Station_ID = null; } else {
      this.OD_Entry_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_Entry_Line_ID = null; } else {
      this.OD_Entry_Line_ID = __cur_str;
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
    if (__cur_str.equals("null")) { this.Ride_Mnt_Segment_Cd = null; } else {
      this.Ride_Mnt_Segment_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Data_Stat_Std_Cd = null; } else {
      this.Data_Stat_Std_Cd = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ride_Mnt_Seg_Pcnt = null; } else {
      this.Ride_Mnt_Seg_Pcnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tour_Mnt_Seg_Pcnt = null; } else {
      this.Tour_Mnt_Seg_Pcnt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Stat_Index_Type_Cd", this.Stat_Index_Type_Cd);
    __sqoop$field_map.put("Prod_ID", this.Prod_ID);
    __sqoop$field_map.put("OD_Entry_Station_ID", this.OD_Entry_Station_ID);
    __sqoop$field_map.put("OD_Entry_Line_ID", this.OD_Entry_Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Ride_Mnt_Segment_Cd", this.Ride_Mnt_Segment_Cd);
    __sqoop$field_map.put("Data_Stat_Std_Cd", this.Data_Stat_Std_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Ride_Mnt_Seg_Pcnt", this.Ride_Mnt_Seg_Pcnt);
    __sqoop$field_map.put("Tour_Mnt_Seg_Pcnt", this.Tour_Mnt_Seg_Pcnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Stat_Index_Type_Cd", this.Stat_Index_Type_Cd);
    __sqoop$field_map.put("Prod_ID", this.Prod_ID);
    __sqoop$field_map.put("OD_Entry_Station_ID", this.OD_Entry_Station_ID);
    __sqoop$field_map.put("OD_Entry_Line_ID", this.OD_Entry_Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Ride_Mnt_Segment_Cd", this.Ride_Mnt_Segment_Cd);
    __sqoop$field_map.put("Data_Stat_Std_Cd", this.Data_Stat_Std_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Ride_Mnt_Seg_Pcnt", this.Ride_Mnt_Seg_Pcnt);
    __sqoop$field_map.put("Tour_Mnt_Seg_Pcnt", this.Tour_Mnt_Seg_Pcnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
