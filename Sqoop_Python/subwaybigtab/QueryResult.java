// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 16 14:24:48 CST 2020
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
    setters.put("Dectime_Stat_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Dectime_Stat_Index_Cd = (String)value;
      }
    });
    setters.put("Stat_Index_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Stat_Index_Type_Cd = (String)value;
      }
    });
    setters.put("Pinnacle_Start_Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Pinnacle_Start_Time = (java.sql.Time)value;
      }
    });
    setters.put("Pinnacle_End_Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Pinnacle_End_Time = (java.sql.Time)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Line_ID = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("Pinnacle_Section_Id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Pinnacle_Section_Id = (String)value;
      }
    });
    setters.put("Stat_Meth_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Stat_Meth_Cd = (String)value;
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
    setters.put("Pinnacle_Section_Name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Pinnacle_Section_Name = (String)value;
      }
    });
    setters.put("Pinnacle_Sect_Pasgr_Qtty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Pinnacle_Sect_Pasgr_Qtty = (java.math.BigDecimal)value;
      }
    });
    setters.put("Section_Pasgr_Qtty_Sum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Section_Pasgr_Qtty_Sum = (java.math.BigDecimal)value;
      }
    });
    setters.put("Section_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Section_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Bosom_Imbalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.Bosom_Imbalance = (java.math.BigDecimal)value;
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
  private String Dectime_Stat_Index_Cd;
  public String get_Dectime_Stat_Index_Cd() {
    return Dectime_Stat_Index_Cd;
  }
  public void set_Dectime_Stat_Index_Cd(String Dectime_Stat_Index_Cd) {
    this.Dectime_Stat_Index_Cd = Dectime_Stat_Index_Cd;
  }
  public QueryResult with_Dectime_Stat_Index_Cd(String Dectime_Stat_Index_Cd) {
    this.Dectime_Stat_Index_Cd = Dectime_Stat_Index_Cd;
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
  private java.sql.Time Pinnacle_Start_Time;
  public java.sql.Time get_Pinnacle_Start_Time() {
    return Pinnacle_Start_Time;
  }
  public void set_Pinnacle_Start_Time(java.sql.Time Pinnacle_Start_Time) {
    this.Pinnacle_Start_Time = Pinnacle_Start_Time;
  }
  public QueryResult with_Pinnacle_Start_Time(java.sql.Time Pinnacle_Start_Time) {
    this.Pinnacle_Start_Time = Pinnacle_Start_Time;
    return this;
  }
  private java.sql.Time Pinnacle_End_Time;
  public java.sql.Time get_Pinnacle_End_Time() {
    return Pinnacle_End_Time;
  }
  public void set_Pinnacle_End_Time(java.sql.Time Pinnacle_End_Time) {
    this.Pinnacle_End_Time = Pinnacle_End_Time;
  }
  public QueryResult with_Pinnacle_End_Time(java.sql.Time Pinnacle_End_Time) {
    this.Pinnacle_End_Time = Pinnacle_End_Time;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public QueryResult with_Line_ID(String Line_ID) {
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
  public QueryResult with_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
    return this;
  }
  private String Pinnacle_Section_Id;
  public String get_Pinnacle_Section_Id() {
    return Pinnacle_Section_Id;
  }
  public void set_Pinnacle_Section_Id(String Pinnacle_Section_Id) {
    this.Pinnacle_Section_Id = Pinnacle_Section_Id;
  }
  public QueryResult with_Pinnacle_Section_Id(String Pinnacle_Section_Id) {
    this.Pinnacle_Section_Id = Pinnacle_Section_Id;
    return this;
  }
  private String Stat_Meth_Cd;
  public String get_Stat_Meth_Cd() {
    return Stat_Meth_Cd;
  }
  public void set_Stat_Meth_Cd(String Stat_Meth_Cd) {
    this.Stat_Meth_Cd = Stat_Meth_Cd;
  }
  public QueryResult with_Stat_Meth_Cd(String Stat_Meth_Cd) {
    this.Stat_Meth_Cd = Stat_Meth_Cd;
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
  private String Pinnacle_Section_Name;
  public String get_Pinnacle_Section_Name() {
    return Pinnacle_Section_Name;
  }
  public void set_Pinnacle_Section_Name(String Pinnacle_Section_Name) {
    this.Pinnacle_Section_Name = Pinnacle_Section_Name;
  }
  public QueryResult with_Pinnacle_Section_Name(String Pinnacle_Section_Name) {
    this.Pinnacle_Section_Name = Pinnacle_Section_Name;
    return this;
  }
  private java.math.BigDecimal Pinnacle_Sect_Pasgr_Qtty;
  public java.math.BigDecimal get_Pinnacle_Sect_Pasgr_Qtty() {
    return Pinnacle_Sect_Pasgr_Qtty;
  }
  public void set_Pinnacle_Sect_Pasgr_Qtty(java.math.BigDecimal Pinnacle_Sect_Pasgr_Qtty) {
    this.Pinnacle_Sect_Pasgr_Qtty = Pinnacle_Sect_Pasgr_Qtty;
  }
  public QueryResult with_Pinnacle_Sect_Pasgr_Qtty(java.math.BigDecimal Pinnacle_Sect_Pasgr_Qtty) {
    this.Pinnacle_Sect_Pasgr_Qtty = Pinnacle_Sect_Pasgr_Qtty;
    return this;
  }
  private java.math.BigDecimal Section_Pasgr_Qtty_Sum;
  public java.math.BigDecimal get_Section_Pasgr_Qtty_Sum() {
    return Section_Pasgr_Qtty_Sum;
  }
  public void set_Section_Pasgr_Qtty_Sum(java.math.BigDecimal Section_Pasgr_Qtty_Sum) {
    this.Section_Pasgr_Qtty_Sum = Section_Pasgr_Qtty_Sum;
  }
  public QueryResult with_Section_Pasgr_Qtty_Sum(java.math.BigDecimal Section_Pasgr_Qtty_Sum) {
    this.Section_Pasgr_Qtty_Sum = Section_Pasgr_Qtty_Sum;
    return this;
  }
  private java.math.BigDecimal Section_Cnt;
  public java.math.BigDecimal get_Section_Cnt() {
    return Section_Cnt;
  }
  public void set_Section_Cnt(java.math.BigDecimal Section_Cnt) {
    this.Section_Cnt = Section_Cnt;
  }
  public QueryResult with_Section_Cnt(java.math.BigDecimal Section_Cnt) {
    this.Section_Cnt = Section_Cnt;
    return this;
  }
  private java.math.BigDecimal Bosom_Imbalance;
  public java.math.BigDecimal get_Bosom_Imbalance() {
    return Bosom_Imbalance;
  }
  public void set_Bosom_Imbalance(java.math.BigDecimal Bosom_Imbalance) {
    this.Bosom_Imbalance = Bosom_Imbalance;
  }
  public QueryResult with_Bosom_Imbalance(java.math.BigDecimal Bosom_Imbalance) {
    this.Bosom_Imbalance = Bosom_Imbalance;
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
    equal = equal && (this.Dectime_Stat_Index_Cd == null ? that.Dectime_Stat_Index_Cd == null : this.Dectime_Stat_Index_Cd.equals(that.Dectime_Stat_Index_Cd));
    equal = equal && (this.Stat_Index_Type_Cd == null ? that.Stat_Index_Type_Cd == null : this.Stat_Index_Type_Cd.equals(that.Stat_Index_Type_Cd));
    equal = equal && (this.Pinnacle_Start_Time == null ? that.Pinnacle_Start_Time == null : this.Pinnacle_Start_Time.equals(that.Pinnacle_Start_Time));
    equal = equal && (this.Pinnacle_End_Time == null ? that.Pinnacle_End_Time == null : this.Pinnacle_End_Time.equals(that.Pinnacle_End_Time));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Pinnacle_Section_Id == null ? that.Pinnacle_Section_Id == null : this.Pinnacle_Section_Id.equals(that.Pinnacle_Section_Id));
    equal = equal && (this.Stat_Meth_Cd == null ? that.Stat_Meth_Cd == null : this.Stat_Meth_Cd.equals(that.Stat_Meth_Cd));
    equal = equal && (this.Data_Stat_Std_Cd == null ? that.Data_Stat_Std_Cd == null : this.Data_Stat_Std_Cd.equals(that.Data_Stat_Std_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Pinnacle_Section_Name == null ? that.Pinnacle_Section_Name == null : this.Pinnacle_Section_Name.equals(that.Pinnacle_Section_Name));
    equal = equal && (this.Pinnacle_Sect_Pasgr_Qtty == null ? that.Pinnacle_Sect_Pasgr_Qtty == null : this.Pinnacle_Sect_Pasgr_Qtty.equals(that.Pinnacle_Sect_Pasgr_Qtty));
    equal = equal && (this.Section_Pasgr_Qtty_Sum == null ? that.Section_Pasgr_Qtty_Sum == null : this.Section_Pasgr_Qtty_Sum.equals(that.Section_Pasgr_Qtty_Sum));
    equal = equal && (this.Section_Cnt == null ? that.Section_Cnt == null : this.Section_Cnt.equals(that.Section_Cnt));
    equal = equal && (this.Bosom_Imbalance == null ? that.Bosom_Imbalance == null : this.Bosom_Imbalance.equals(that.Bosom_Imbalance));
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
    equal = equal && (this.Dectime_Stat_Index_Cd == null ? that.Dectime_Stat_Index_Cd == null : this.Dectime_Stat_Index_Cd.equals(that.Dectime_Stat_Index_Cd));
    equal = equal && (this.Stat_Index_Type_Cd == null ? that.Stat_Index_Type_Cd == null : this.Stat_Index_Type_Cd.equals(that.Stat_Index_Type_Cd));
    equal = equal && (this.Pinnacle_Start_Time == null ? that.Pinnacle_Start_Time == null : this.Pinnacle_Start_Time.equals(that.Pinnacle_Start_Time));
    equal = equal && (this.Pinnacle_End_Time == null ? that.Pinnacle_End_Time == null : this.Pinnacle_End_Time.equals(that.Pinnacle_End_Time));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Pinnacle_Section_Id == null ? that.Pinnacle_Section_Id == null : this.Pinnacle_Section_Id.equals(that.Pinnacle_Section_Id));
    equal = equal && (this.Stat_Meth_Cd == null ? that.Stat_Meth_Cd == null : this.Stat_Meth_Cd.equals(that.Stat_Meth_Cd));
    equal = equal && (this.Data_Stat_Std_Cd == null ? that.Data_Stat_Std_Cd == null : this.Data_Stat_Std_Cd.equals(that.Data_Stat_Std_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Pinnacle_Section_Name == null ? that.Pinnacle_Section_Name == null : this.Pinnacle_Section_Name.equals(that.Pinnacle_Section_Name));
    equal = equal && (this.Pinnacle_Sect_Pasgr_Qtty == null ? that.Pinnacle_Sect_Pasgr_Qtty == null : this.Pinnacle_Sect_Pasgr_Qtty.equals(that.Pinnacle_Sect_Pasgr_Qtty));
    equal = equal && (this.Section_Pasgr_Qtty_Sum == null ? that.Section_Pasgr_Qtty_Sum == null : this.Section_Pasgr_Qtty_Sum.equals(that.Section_Pasgr_Qtty_Sum));
    equal = equal && (this.Section_Cnt == null ? that.Section_Cnt == null : this.Section_Cnt.equals(that.Section_Cnt));
    equal = equal && (this.Bosom_Imbalance == null ? that.Bosom_Imbalance == null : this.Bosom_Imbalance.equals(that.Bosom_Imbalance));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Dectime_Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Stat_Index_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Pinnacle_Start_Time = JdbcWritableBridge.readTime(4, __dbResults);
    this.Pinnacle_End_Time = JdbcWritableBridge.readTime(5, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Pinnacle_Section_Id = JdbcWritableBridge.readString(8, __dbResults);
    this.Stat_Meth_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Data_Stat_Std_Cd = JdbcWritableBridge.readString(10, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(11, __dbResults);
    this.Pinnacle_Section_Name = JdbcWritableBridge.readString(12, __dbResults);
    this.Pinnacle_Sect_Pasgr_Qtty = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Section_Pasgr_Qtty_Sum = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Section_Cnt = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Bosom_Imbalance = JdbcWritableBridge.readBigDecimal(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Dectime_Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Stat_Index_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Pinnacle_Start_Time = JdbcWritableBridge.readTime(4, __dbResults);
    this.Pinnacle_End_Time = JdbcWritableBridge.readTime(5, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Pinnacle_Section_Id = JdbcWritableBridge.readString(8, __dbResults);
    this.Stat_Meth_Cd = JdbcWritableBridge.readString(9, __dbResults);
    this.Data_Stat_Std_Cd = JdbcWritableBridge.readString(10, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(11, __dbResults);
    this.Pinnacle_Section_Name = JdbcWritableBridge.readString(12, __dbResults);
    this.Pinnacle_Sect_Pasgr_Qtty = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Section_Pasgr_Qtty_Sum = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Section_Cnt = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Bosom_Imbalance = JdbcWritableBridge.readBigDecimal(16, __dbResults);
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
    JdbcWritableBridge.writeString(Dectime_Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Type_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTime(Pinnacle_Start_Time, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(Pinnacle_End_Time, 5 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Pinnacle_Section_Id, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Meth_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Data_Stat_Std_Cd, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Pinnacle_Section_Name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pinnacle_Sect_Pasgr_Qtty, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Pasgr_Qtty_Sum, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Cnt, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Bosom_Imbalance, 16 + __off, 3, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Dectime_Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Type_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTime(Pinnacle_Start_Time, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(Pinnacle_End_Time, 5 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Pinnacle_Section_Id, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Meth_Cd, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Data_Stat_Std_Cd, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Pinnacle_Section_Name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pinnacle_Sect_Pasgr_Qtty, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Pasgr_Qtty_Sum, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Cnt, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Bosom_Imbalance, 16 + __off, 3, __dbStmt);
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
        this.Dectime_Stat_Index_Cd = null;
    } else {
    this.Dectime_Stat_Index_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Stat_Index_Type_Cd = null;
    } else {
    this.Stat_Index_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Pinnacle_Start_Time = null;
    } else {
    this.Pinnacle_Start_Time = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Pinnacle_End_Time = null;
    } else {
    this.Pinnacle_End_Time = new Time(__dataIn.readLong());
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
        this.Pinnacle_Section_Id = null;
    } else {
    this.Pinnacle_Section_Id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Stat_Meth_Cd = null;
    } else {
    this.Stat_Meth_Cd = Text.readString(__dataIn);
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
        this.Pinnacle_Section_Name = null;
    } else {
    this.Pinnacle_Section_Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Pinnacle_Sect_Pasgr_Qtty = null;
    } else {
    this.Pinnacle_Sect_Pasgr_Qtty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Pasgr_Qtty_Sum = null;
    } else {
    this.Section_Pasgr_Qtty_Sum = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Cnt = null;
    } else {
    this.Section_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Bosom_Imbalance = null;
    } else {
    this.Bosom_Imbalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Dectime_Stat_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dectime_Stat_Index_Cd);
    }
    if (null == this.Stat_Index_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Type_Cd);
    }
    if (null == this.Pinnacle_Start_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Pinnacle_Start_Time.getTime());
    }
    if (null == this.Pinnacle_End_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Pinnacle_End_Time.getTime());
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
    if (null == this.Pinnacle_Section_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pinnacle_Section_Id);
    }
    if (null == this.Stat_Meth_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Meth_Cd);
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
    if (null == this.Pinnacle_Section_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pinnacle_Section_Name);
    }
    if (null == this.Pinnacle_Sect_Pasgr_Qtty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pinnacle_Sect_Pasgr_Qtty, __dataOut);
    }
    if (null == this.Section_Pasgr_Qtty_Sum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Pasgr_Qtty_Sum, __dataOut);
    }
    if (null == this.Section_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Cnt, __dataOut);
    }
    if (null == this.Bosom_Imbalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Bosom_Imbalance, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Dectime_Stat_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dectime_Stat_Index_Cd);
    }
    if (null == this.Stat_Index_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Index_Type_Cd);
    }
    if (null == this.Pinnacle_Start_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Pinnacle_Start_Time.getTime());
    }
    if (null == this.Pinnacle_End_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Pinnacle_End_Time.getTime());
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
    if (null == this.Pinnacle_Section_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pinnacle_Section_Id);
    }
    if (null == this.Stat_Meth_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Meth_Cd);
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
    if (null == this.Pinnacle_Section_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pinnacle_Section_Name);
    }
    if (null == this.Pinnacle_Sect_Pasgr_Qtty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pinnacle_Sect_Pasgr_Qtty, __dataOut);
    }
    if (null == this.Section_Pasgr_Qtty_Sum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Pasgr_Qtty_Sum, __dataOut);
    }
    if (null == this.Section_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Cnt, __dataOut);
    }
    if (null == this.Bosom_Imbalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Bosom_Imbalance, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Dectime_Stat_Index_Cd==null?"\\N":Dectime_Stat_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Type_Cd==null?"\\N":Stat_Index_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Start_Time==null?"\\N":"" + Pinnacle_Start_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_End_Time==null?"\\N":"" + Pinnacle_End_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Section_Id==null?"\\N":Pinnacle_Section_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Meth_Cd==null?"\\N":Stat_Meth_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Stat_Std_Cd==null?"\\N":Data_Stat_Std_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Section_Name==null?"\\N":Pinnacle_Section_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Sect_Pasgr_Qtty==null?"\\N":Pinnacle_Sect_Pasgr_Qtty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Pasgr_Qtty_Sum==null?"\\N":Section_Pasgr_Qtty_Sum.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Cnt==null?"\\N":Section_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bosom_Imbalance==null?"\\N":Bosom_Imbalance.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dectime_Stat_Index_Cd==null?"\\N":Dectime_Stat_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Index_Type_Cd==null?"\\N":Stat_Index_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Start_Time==null?"\\N":"" + Pinnacle_Start_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_End_Time==null?"\\N":"" + Pinnacle_End_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Section_Id==null?"\\N":Pinnacle_Section_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Meth_Cd==null?"\\N":Stat_Meth_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Stat_Std_Cd==null?"\\N":Data_Stat_Std_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Section_Name==null?"\\N":Pinnacle_Section_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pinnacle_Sect_Pasgr_Qtty==null?"\\N":Pinnacle_Sect_Pasgr_Qtty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Pasgr_Qtty_Sum==null?"\\N":Section_Pasgr_Qtty_Sum.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Cnt==null?"\\N":Section_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bosom_Imbalance==null?"\\N":Bosom_Imbalance.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Dectime_Stat_Index_Cd = null; } else {
      this.Dectime_Stat_Index_Cd = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_Start_Time = null; } else {
      this.Pinnacle_Start_Time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_End_Time = null; } else {
      this.Pinnacle_End_Time = java.sql.Time.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Pinnacle_Section_Id = null; } else {
      this.Pinnacle_Section_Id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Meth_Cd = null; } else {
      this.Stat_Meth_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Pinnacle_Section_Name = null; } else {
      this.Pinnacle_Section_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_Sect_Pasgr_Qtty = null; } else {
      this.Pinnacle_Sect_Pasgr_Qtty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Pasgr_Qtty_Sum = null; } else {
      this.Section_Pasgr_Qtty_Sum = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Cnt = null; } else {
      this.Section_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Bosom_Imbalance = null; } else {
      this.Bosom_Imbalance = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Dectime_Stat_Index_Cd = null; } else {
      this.Dectime_Stat_Index_Cd = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_Start_Time = null; } else {
      this.Pinnacle_Start_Time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_End_Time = null; } else {
      this.Pinnacle_End_Time = java.sql.Time.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Pinnacle_Section_Id = null; } else {
      this.Pinnacle_Section_Id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Stat_Meth_Cd = null; } else {
      this.Stat_Meth_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Pinnacle_Section_Name = null; } else {
      this.Pinnacle_Section_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pinnacle_Sect_Pasgr_Qtty = null; } else {
      this.Pinnacle_Sect_Pasgr_Qtty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Pasgr_Qtty_Sum = null; } else {
      this.Section_Pasgr_Qtty_Sum = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Cnt = null; } else {
      this.Section_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Bosom_Imbalance = null; } else {
      this.Bosom_Imbalance = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Pinnacle_Start_Time = (o.Pinnacle_Start_Time != null) ? (java.sql.Time) o.Pinnacle_Start_Time.clone() : null;
    o.Pinnacle_End_Time = (o.Pinnacle_End_Time != null) ? (java.sql.Time) o.Pinnacle_End_Time.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Pinnacle_Start_Time = (o.Pinnacle_Start_Time != null) ? (java.sql.Time) o.Pinnacle_Start_Time.clone() : null;
    o.Pinnacle_End_Time = (o.Pinnacle_End_Time != null) ? (java.sql.Time) o.Pinnacle_End_Time.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Dectime_Stat_Index_Cd", this.Dectime_Stat_Index_Cd);
    __sqoop$field_map.put("Stat_Index_Type_Cd", this.Stat_Index_Type_Cd);
    __sqoop$field_map.put("Pinnacle_Start_Time", this.Pinnacle_Start_Time);
    __sqoop$field_map.put("Pinnacle_End_Time", this.Pinnacle_End_Time);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Pinnacle_Section_Id", this.Pinnacle_Section_Id);
    __sqoop$field_map.put("Stat_Meth_Cd", this.Stat_Meth_Cd);
    __sqoop$field_map.put("Data_Stat_Std_Cd", this.Data_Stat_Std_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Pinnacle_Section_Name", this.Pinnacle_Section_Name);
    __sqoop$field_map.put("Pinnacle_Sect_Pasgr_Qtty", this.Pinnacle_Sect_Pasgr_Qtty);
    __sqoop$field_map.put("Section_Pasgr_Qtty_Sum", this.Section_Pasgr_Qtty_Sum);
    __sqoop$field_map.put("Section_Cnt", this.Section_Cnt);
    __sqoop$field_map.put("Bosom_Imbalance", this.Bosom_Imbalance);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Dectime_Stat_Index_Cd", this.Dectime_Stat_Index_Cd);
    __sqoop$field_map.put("Stat_Index_Type_Cd", this.Stat_Index_Type_Cd);
    __sqoop$field_map.put("Pinnacle_Start_Time", this.Pinnacle_Start_Time);
    __sqoop$field_map.put("Pinnacle_End_Time", this.Pinnacle_End_Time);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Pinnacle_Section_Id", this.Pinnacle_Section_Id);
    __sqoop$field_map.put("Stat_Meth_Cd", this.Stat_Meth_Cd);
    __sqoop$field_map.put("Data_Stat_Std_Cd", this.Data_Stat_Std_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Pinnacle_Section_Name", this.Pinnacle_Section_Name);
    __sqoop$field_map.put("Pinnacle_Sect_Pasgr_Qtty", this.Pinnacle_Sect_Pasgr_Qtty);
    __sqoop$field_map.put("Section_Pasgr_Qtty_Sum", this.Section_Pasgr_Qtty_Sum);
    __sqoop$field_map.put("Section_Cnt", this.Section_Cnt);
    __sqoop$field_map.put("Bosom_Imbalance", this.Bosom_Imbalance);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
