// ORM class for table 'T98_TRAIN_OPR_H_ST_SCH'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 10 15:52:41 CST 2020
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

public class T98_TRAIN_OPR_H_ST_SCH extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Stat_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Stat_Index_Cd = (String)value;
      }
    });
    setters.put("Line_Merge_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Line_Merge_Ind = (Integer)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Line_ID = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("Plan_Pasgr_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Plan_Pasgr_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Plan_Empty_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Plan_Empty_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Plan_Trip_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Plan_Trip_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("ACTL_Pasgr_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.ACTL_Pasgr_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("ACTL_Empty_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.ACTL_Empty_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Actl_Trip_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Actl_Trip_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Off_Line_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Off_Line_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Pass_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Pass_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Add_Tmp_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Add_Tmp_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Rescue_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TRAIN_OPR_H_ST_SCH.this.Rescue_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TRAIN_OPR_H_ST_SCH() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_TRAIN_OPR_H_ST_SCH with_Stat_Index_Cd(String Stat_Index_Cd) {
    this.Stat_Index_Cd = Stat_Index_Cd;
    return this;
  }
  private Integer Line_Merge_Ind;
  public Integer get_Line_Merge_Ind() {
    return Line_Merge_Ind;
  }
  public void set_Line_Merge_Ind(Integer Line_Merge_Ind) {
    this.Line_Merge_Ind = Line_Merge_Ind;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Line_Merge_Ind(Integer Line_Merge_Ind) {
    this.Line_Merge_Ind = Line_Merge_Ind;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Line_ID(String Line_ID) {
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
  public T98_TRAIN_OPR_H_ST_SCH with_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
    return this;
  }
  private java.math.BigDecimal Plan_Pasgr_Train_Cnt;
  public java.math.BigDecimal get_Plan_Pasgr_Train_Cnt() {
    return Plan_Pasgr_Train_Cnt;
  }
  public void set_Plan_Pasgr_Train_Cnt(java.math.BigDecimal Plan_Pasgr_Train_Cnt) {
    this.Plan_Pasgr_Train_Cnt = Plan_Pasgr_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Plan_Pasgr_Train_Cnt(java.math.BigDecimal Plan_Pasgr_Train_Cnt) {
    this.Plan_Pasgr_Train_Cnt = Plan_Pasgr_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Plan_Empty_Train_Cnt;
  public java.math.BigDecimal get_Plan_Empty_Train_Cnt() {
    return Plan_Empty_Train_Cnt;
  }
  public void set_Plan_Empty_Train_Cnt(java.math.BigDecimal Plan_Empty_Train_Cnt) {
    this.Plan_Empty_Train_Cnt = Plan_Empty_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Plan_Empty_Train_Cnt(java.math.BigDecimal Plan_Empty_Train_Cnt) {
    this.Plan_Empty_Train_Cnt = Plan_Empty_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Plan_Trip_Train_Cnt;
  public java.math.BigDecimal get_Plan_Trip_Train_Cnt() {
    return Plan_Trip_Train_Cnt;
  }
  public void set_Plan_Trip_Train_Cnt(java.math.BigDecimal Plan_Trip_Train_Cnt) {
    this.Plan_Trip_Train_Cnt = Plan_Trip_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Plan_Trip_Train_Cnt(java.math.BigDecimal Plan_Trip_Train_Cnt) {
    this.Plan_Trip_Train_Cnt = Plan_Trip_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal ACTL_Pasgr_Train_Cnt;
  public java.math.BigDecimal get_ACTL_Pasgr_Train_Cnt() {
    return ACTL_Pasgr_Train_Cnt;
  }
  public void set_ACTL_Pasgr_Train_Cnt(java.math.BigDecimal ACTL_Pasgr_Train_Cnt) {
    this.ACTL_Pasgr_Train_Cnt = ACTL_Pasgr_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_ACTL_Pasgr_Train_Cnt(java.math.BigDecimal ACTL_Pasgr_Train_Cnt) {
    this.ACTL_Pasgr_Train_Cnt = ACTL_Pasgr_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal ACTL_Empty_Train_Cnt;
  public java.math.BigDecimal get_ACTL_Empty_Train_Cnt() {
    return ACTL_Empty_Train_Cnt;
  }
  public void set_ACTL_Empty_Train_Cnt(java.math.BigDecimal ACTL_Empty_Train_Cnt) {
    this.ACTL_Empty_Train_Cnt = ACTL_Empty_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_ACTL_Empty_Train_Cnt(java.math.BigDecimal ACTL_Empty_Train_Cnt) {
    this.ACTL_Empty_Train_Cnt = ACTL_Empty_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Actl_Trip_Train_Cnt;
  public java.math.BigDecimal get_Actl_Trip_Train_Cnt() {
    return Actl_Trip_Train_Cnt;
  }
  public void set_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Off_Line_Cnt;
  public java.math.BigDecimal get_Off_Line_Cnt() {
    return Off_Line_Cnt;
  }
  public void set_Off_Line_Cnt(java.math.BigDecimal Off_Line_Cnt) {
    this.Off_Line_Cnt = Off_Line_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Off_Line_Cnt(java.math.BigDecimal Off_Line_Cnt) {
    this.Off_Line_Cnt = Off_Line_Cnt;
    return this;
  }
  private java.math.BigDecimal Pass_Train_Cnt;
  public java.math.BigDecimal get_Pass_Train_Cnt() {
    return Pass_Train_Cnt;
  }
  public void set_Pass_Train_Cnt(java.math.BigDecimal Pass_Train_Cnt) {
    this.Pass_Train_Cnt = Pass_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Pass_Train_Cnt(java.math.BigDecimal Pass_Train_Cnt) {
    this.Pass_Train_Cnt = Pass_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Add_Tmp_Train_Cnt;
  public java.math.BigDecimal get_Add_Tmp_Train_Cnt() {
    return Add_Tmp_Train_Cnt;
  }
  public void set_Add_Tmp_Train_Cnt(java.math.BigDecimal Add_Tmp_Train_Cnt) {
    this.Add_Tmp_Train_Cnt = Add_Tmp_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Add_Tmp_Train_Cnt(java.math.BigDecimal Add_Tmp_Train_Cnt) {
    this.Add_Tmp_Train_Cnt = Add_Tmp_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Rescue_Train_Cnt;
  public java.math.BigDecimal get_Rescue_Train_Cnt() {
    return Rescue_Train_Cnt;
  }
  public void set_Rescue_Train_Cnt(java.math.BigDecimal Rescue_Train_Cnt) {
    this.Rescue_Train_Cnt = Rescue_Train_Cnt;
  }
  public T98_TRAIN_OPR_H_ST_SCH with_Rescue_Train_Cnt(java.math.BigDecimal Rescue_Train_Cnt) {
    this.Rescue_Train_Cnt = Rescue_Train_Cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAIN_OPR_H_ST_SCH)) {
      return false;
    }
    T98_TRAIN_OPR_H_ST_SCH that = (T98_TRAIN_OPR_H_ST_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_Merge_Ind == null ? that.Line_Merge_Ind == null : this.Line_Merge_Ind.equals(that.Line_Merge_Ind));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Plan_Pasgr_Train_Cnt == null ? that.Plan_Pasgr_Train_Cnt == null : this.Plan_Pasgr_Train_Cnt.equals(that.Plan_Pasgr_Train_Cnt));
    equal = equal && (this.Plan_Empty_Train_Cnt == null ? that.Plan_Empty_Train_Cnt == null : this.Plan_Empty_Train_Cnt.equals(that.Plan_Empty_Train_Cnt));
    equal = equal && (this.Plan_Trip_Train_Cnt == null ? that.Plan_Trip_Train_Cnt == null : this.Plan_Trip_Train_Cnt.equals(that.Plan_Trip_Train_Cnt));
    equal = equal && (this.ACTL_Pasgr_Train_Cnt == null ? that.ACTL_Pasgr_Train_Cnt == null : this.ACTL_Pasgr_Train_Cnt.equals(that.ACTL_Pasgr_Train_Cnt));
    equal = equal && (this.ACTL_Empty_Train_Cnt == null ? that.ACTL_Empty_Train_Cnt == null : this.ACTL_Empty_Train_Cnt.equals(that.ACTL_Empty_Train_Cnt));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    equal = equal && (this.Off_Line_Cnt == null ? that.Off_Line_Cnt == null : this.Off_Line_Cnt.equals(that.Off_Line_Cnt));
    equal = equal && (this.Pass_Train_Cnt == null ? that.Pass_Train_Cnt == null : this.Pass_Train_Cnt.equals(that.Pass_Train_Cnt));
    equal = equal && (this.Add_Tmp_Train_Cnt == null ? that.Add_Tmp_Train_Cnt == null : this.Add_Tmp_Train_Cnt.equals(that.Add_Tmp_Train_Cnt));
    equal = equal && (this.Rescue_Train_Cnt == null ? that.Rescue_Train_Cnt == null : this.Rescue_Train_Cnt.equals(that.Rescue_Train_Cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TRAIN_OPR_H_ST_SCH)) {
      return false;
    }
    T98_TRAIN_OPR_H_ST_SCH that = (T98_TRAIN_OPR_H_ST_SCH) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Index_Cd == null ? that.Stat_Index_Cd == null : this.Stat_Index_Cd.equals(that.Stat_Index_Cd));
    equal = equal && (this.Line_Merge_Ind == null ? that.Line_Merge_Ind == null : this.Line_Merge_Ind.equals(that.Line_Merge_Ind));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Plan_Pasgr_Train_Cnt == null ? that.Plan_Pasgr_Train_Cnt == null : this.Plan_Pasgr_Train_Cnt.equals(that.Plan_Pasgr_Train_Cnt));
    equal = equal && (this.Plan_Empty_Train_Cnt == null ? that.Plan_Empty_Train_Cnt == null : this.Plan_Empty_Train_Cnt.equals(that.Plan_Empty_Train_Cnt));
    equal = equal && (this.Plan_Trip_Train_Cnt == null ? that.Plan_Trip_Train_Cnt == null : this.Plan_Trip_Train_Cnt.equals(that.Plan_Trip_Train_Cnt));
    equal = equal && (this.ACTL_Pasgr_Train_Cnt == null ? that.ACTL_Pasgr_Train_Cnt == null : this.ACTL_Pasgr_Train_Cnt.equals(that.ACTL_Pasgr_Train_Cnt));
    equal = equal && (this.ACTL_Empty_Train_Cnt == null ? that.ACTL_Empty_Train_Cnt == null : this.ACTL_Empty_Train_Cnt.equals(that.ACTL_Empty_Train_Cnt));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    equal = equal && (this.Off_Line_Cnt == null ? that.Off_Line_Cnt == null : this.Off_Line_Cnt.equals(that.Off_Line_Cnt));
    equal = equal && (this.Pass_Train_Cnt == null ? that.Pass_Train_Cnt == null : this.Pass_Train_Cnt.equals(that.Pass_Train_Cnt));
    equal = equal && (this.Add_Tmp_Train_Cnt == null ? that.Add_Tmp_Train_Cnt == null : this.Add_Tmp_Train_Cnt.equals(that.Add_Tmp_Train_Cnt));
    equal = equal && (this.Rescue_Train_Cnt == null ? that.Rescue_Train_Cnt == null : this.Rescue_Train_Cnt.equals(that.Rescue_Train_Cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_Merge_Ind = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Plan_Pasgr_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Plan_Empty_Train_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Plan_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ACTL_Pasgr_Train_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ACTL_Empty_Train_Cnt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Off_Line_Cnt = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Pass_Train_Cnt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Add_Tmp_Train_Cnt = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Rescue_Train_Cnt = JdbcWritableBridge.readBigDecimal(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Index_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_Merge_Ind = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Plan_Pasgr_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Plan_Empty_Train_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Plan_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ACTL_Pasgr_Train_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ACTL_Empty_Train_Cnt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Off_Line_Cnt = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Pass_Train_Cnt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Add_Tmp_Train_Cnt = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Rescue_Train_Cnt = JdbcWritableBridge.readBigDecimal(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(Line_Merge_Ind, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Pasgr_Train_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Empty_Train_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Trip_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTL_Pasgr_Train_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTL_Empty_Train_Cnt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Off_Line_Cnt, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pass_Train_Cnt, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Add_Tmp_Train_Cnt, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Rescue_Train_Cnt, 15 + __off, 3, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Index_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Line_Merge_Ind, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Pasgr_Train_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Empty_Train_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Plan_Trip_Train_Cnt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTL_Pasgr_Train_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTL_Empty_Train_Cnt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Off_Line_Cnt, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Pass_Train_Cnt, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Add_Tmp_Train_Cnt, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Rescue_Train_Cnt, 15 + __off, 3, __dbStmt);
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
        this.Line_Merge_Ind = null;
    } else {
    this.Line_Merge_Ind = Integer.valueOf(__dataIn.readInt());
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
        this.Plan_Pasgr_Train_Cnt = null;
    } else {
    this.Plan_Pasgr_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Plan_Empty_Train_Cnt = null;
    } else {
    this.Plan_Empty_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Plan_Trip_Train_Cnt = null;
    } else {
    this.Plan_Trip_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTL_Pasgr_Train_Cnt = null;
    } else {
    this.ACTL_Pasgr_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTL_Empty_Train_Cnt = null;
    } else {
    this.ACTL_Empty_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Actl_Trip_Train_Cnt = null;
    } else {
    this.Actl_Trip_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Off_Line_Cnt = null;
    } else {
    this.Off_Line_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Pass_Train_Cnt = null;
    } else {
    this.Pass_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Add_Tmp_Train_Cnt = null;
    } else {
    this.Add_Tmp_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Rescue_Train_Cnt = null;
    } else {
    this.Rescue_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Line_Merge_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Line_Merge_Ind);
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
    if (null == this.Plan_Pasgr_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Pasgr_Train_Cnt, __dataOut);
    }
    if (null == this.Plan_Empty_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Empty_Train_Cnt, __dataOut);
    }
    if (null == this.Plan_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.ACTL_Pasgr_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ACTL_Pasgr_Train_Cnt, __dataOut);
    }
    if (null == this.ACTL_Empty_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ACTL_Empty_Train_Cnt, __dataOut);
    }
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.Off_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Off_Line_Cnt, __dataOut);
    }
    if (null == this.Pass_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pass_Train_Cnt, __dataOut);
    }
    if (null == this.Add_Tmp_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Add_Tmp_Train_Cnt, __dataOut);
    }
    if (null == this.Rescue_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Rescue_Train_Cnt, __dataOut);
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
    if (null == this.Line_Merge_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Line_Merge_Ind);
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
    if (null == this.Plan_Pasgr_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Pasgr_Train_Cnt, __dataOut);
    }
    if (null == this.Plan_Empty_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Empty_Train_Cnt, __dataOut);
    }
    if (null == this.Plan_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Plan_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.ACTL_Pasgr_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ACTL_Pasgr_Train_Cnt, __dataOut);
    }
    if (null == this.ACTL_Empty_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ACTL_Empty_Train_Cnt, __dataOut);
    }
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.Off_Line_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Off_Line_Cnt, __dataOut);
    }
    if (null == this.Pass_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Pass_Train_Cnt, __dataOut);
    }
    if (null == this.Add_Tmp_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Add_Tmp_Train_Cnt, __dataOut);
    }
    if (null == this.Rescue_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Rescue_Train_Cnt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Merge_Ind==null?"\\N":"" + Line_Merge_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Pasgr_Train_Cnt==null?"\\N":Plan_Pasgr_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Empty_Train_Cnt==null?"\\N":Plan_Empty_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Trip_Train_Cnt==null?"\\N":Plan_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTL_Pasgr_Train_Cnt==null?"\\N":ACTL_Pasgr_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTL_Empty_Train_Cnt==null?"\\N":ACTL_Empty_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Off_Line_Cnt==null?"\\N":Off_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pass_Train_Cnt==null?"\\N":Pass_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Add_Tmp_Train_Cnt==null?"\\N":Add_Tmp_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Rescue_Train_Cnt==null?"\\N":Rescue_Train_Cnt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Merge_Ind==null?"\\N":"" + Line_Merge_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Pasgr_Train_Cnt==null?"\\N":Plan_Pasgr_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Empty_Train_Cnt==null?"\\N":Plan_Empty_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Plan_Trip_Train_Cnt==null?"\\N":Plan_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTL_Pasgr_Train_Cnt==null?"\\N":ACTL_Pasgr_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTL_Empty_Train_Cnt==null?"\\N":ACTL_Empty_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Off_Line_Cnt==null?"\\N":Off_Line_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pass_Train_Cnt==null?"\\N":Pass_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Add_Tmp_Train_Cnt==null?"\\N":Add_Tmp_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Rescue_Train_Cnt==null?"\\N":Rescue_Train_Cnt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Line_Merge_Ind = null; } else {
      this.Line_Merge_Ind = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Pasgr_Train_Cnt = null; } else {
      this.Plan_Pasgr_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Empty_Train_Cnt = null; } else {
      this.Plan_Empty_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Trip_Train_Cnt = null; } else {
      this.Plan_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTL_Pasgr_Train_Cnt = null; } else {
      this.ACTL_Pasgr_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTL_Empty_Train_Cnt = null; } else {
      this.ACTL_Empty_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pass_Train_Cnt = null; } else {
      this.Pass_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Add_Tmp_Train_Cnt = null; } else {
      this.Add_Tmp_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Rescue_Train_Cnt = null; } else {
      this.Rescue_Train_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Line_Merge_Ind = null; } else {
      this.Line_Merge_Ind = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Pasgr_Train_Cnt = null; } else {
      this.Plan_Pasgr_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Empty_Train_Cnt = null; } else {
      this.Plan_Empty_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Plan_Trip_Train_Cnt = null; } else {
      this.Plan_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTL_Pasgr_Train_Cnt = null; } else {
      this.ACTL_Pasgr_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTL_Empty_Train_Cnt = null; } else {
      this.ACTL_Empty_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pass_Train_Cnt = null; } else {
      this.Pass_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Add_Tmp_Train_Cnt = null; } else {
      this.Add_Tmp_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Rescue_Train_Cnt = null; } else {
      this.Rescue_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TRAIN_OPR_H_ST_SCH o = (T98_TRAIN_OPR_H_ST_SCH) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TRAIN_OPR_H_ST_SCH o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_Merge_Ind", this.Line_Merge_Ind);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Plan_Pasgr_Train_Cnt", this.Plan_Pasgr_Train_Cnt);
    __sqoop$field_map.put("Plan_Empty_Train_Cnt", this.Plan_Empty_Train_Cnt);
    __sqoop$field_map.put("Plan_Trip_Train_Cnt", this.Plan_Trip_Train_Cnt);
    __sqoop$field_map.put("ACTL_Pasgr_Train_Cnt", this.ACTL_Pasgr_Train_Cnt);
    __sqoop$field_map.put("ACTL_Empty_Train_Cnt", this.ACTL_Empty_Train_Cnt);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
    __sqoop$field_map.put("Off_Line_Cnt", this.Off_Line_Cnt);
    __sqoop$field_map.put("Pass_Train_Cnt", this.Pass_Train_Cnt);
    __sqoop$field_map.put("Add_Tmp_Train_Cnt", this.Add_Tmp_Train_Cnt);
    __sqoop$field_map.put("Rescue_Train_Cnt", this.Rescue_Train_Cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Index_Cd", this.Stat_Index_Cd);
    __sqoop$field_map.put("Line_Merge_Ind", this.Line_Merge_Ind);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Plan_Pasgr_Train_Cnt", this.Plan_Pasgr_Train_Cnt);
    __sqoop$field_map.put("Plan_Empty_Train_Cnt", this.Plan_Empty_Train_Cnt);
    __sqoop$field_map.put("Plan_Trip_Train_Cnt", this.Plan_Trip_Train_Cnt);
    __sqoop$field_map.put("ACTL_Pasgr_Train_Cnt", this.ACTL_Pasgr_Train_Cnt);
    __sqoop$field_map.put("ACTL_Empty_Train_Cnt", this.ACTL_Empty_Train_Cnt);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
    __sqoop$field_map.put("Off_Line_Cnt", this.Off_Line_Cnt);
    __sqoop$field_map.put("Pass_Train_Cnt", this.Pass_Train_Cnt);
    __sqoop$field_map.put("Add_Tmp_Train_Cnt", this.Add_Tmp_Train_Cnt);
    __sqoop$field_map.put("Rescue_Train_Cnt", this.Rescue_Train_Cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
