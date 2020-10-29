// ORM class for table 'T98_TKT_SELL_D_STAT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 17:32:19 CST 2020
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

public class T98_TKT_SELL_D_STAT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.Line_ID = (String)value;
      }
    });
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.Station_ID = (String)value;
      }
    });
    setters.put("One_Ktk_Sell_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Ktk_Sell_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Ktk_Sell_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Ktk_Sell_Amt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Sell_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Sell_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Rechange_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Rechange_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Sell_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Sell_Amt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Rechange_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Rechange_Amt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Ktk_Income_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Ktk_Income_Amt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Income_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Income_Amt = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Ktk_Income_Ratio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Ktk_Income_Ratio = (java.math.BigDecimal)value;
      }
    });
    setters.put("One_Card_Income_Ratio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_D_STAT.this.One_Card_Income_Ratio = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TKT_SELL_D_STAT() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TKT_SELL_D_STAT with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_TKT_SELL_D_STAT with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Station_ID;
  public String get_Station_ID() {
    return Station_ID;
  }
  public void set_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
  }
  public T98_TKT_SELL_D_STAT with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private java.math.BigDecimal One_Ktk_Sell_Cnt;
  public java.math.BigDecimal get_One_Ktk_Sell_Cnt() {
    return One_Ktk_Sell_Cnt;
  }
  public void set_One_Ktk_Sell_Cnt(java.math.BigDecimal One_Ktk_Sell_Cnt) {
    this.One_Ktk_Sell_Cnt = One_Ktk_Sell_Cnt;
  }
  public T98_TKT_SELL_D_STAT with_One_Ktk_Sell_Cnt(java.math.BigDecimal One_Ktk_Sell_Cnt) {
    this.One_Ktk_Sell_Cnt = One_Ktk_Sell_Cnt;
    return this;
  }
  private java.math.BigDecimal One_Ktk_Sell_Amt;
  public java.math.BigDecimal get_One_Ktk_Sell_Amt() {
    return One_Ktk_Sell_Amt;
  }
  public void set_One_Ktk_Sell_Amt(java.math.BigDecimal One_Ktk_Sell_Amt) {
    this.One_Ktk_Sell_Amt = One_Ktk_Sell_Amt;
  }
  public T98_TKT_SELL_D_STAT with_One_Ktk_Sell_Amt(java.math.BigDecimal One_Ktk_Sell_Amt) {
    this.One_Ktk_Sell_Amt = One_Ktk_Sell_Amt;
    return this;
  }
  private java.math.BigDecimal One_Card_Sell_Cnt;
  public java.math.BigDecimal get_One_Card_Sell_Cnt() {
    return One_Card_Sell_Cnt;
  }
  public void set_One_Card_Sell_Cnt(java.math.BigDecimal One_Card_Sell_Cnt) {
    this.One_Card_Sell_Cnt = One_Card_Sell_Cnt;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Sell_Cnt(java.math.BigDecimal One_Card_Sell_Cnt) {
    this.One_Card_Sell_Cnt = One_Card_Sell_Cnt;
    return this;
  }
  private java.math.BigDecimal One_Card_Rechange_Cnt;
  public java.math.BigDecimal get_One_Card_Rechange_Cnt() {
    return One_Card_Rechange_Cnt;
  }
  public void set_One_Card_Rechange_Cnt(java.math.BigDecimal One_Card_Rechange_Cnt) {
    this.One_Card_Rechange_Cnt = One_Card_Rechange_Cnt;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Rechange_Cnt(java.math.BigDecimal One_Card_Rechange_Cnt) {
    this.One_Card_Rechange_Cnt = One_Card_Rechange_Cnt;
    return this;
  }
  private java.math.BigDecimal One_Card_Sell_Amt;
  public java.math.BigDecimal get_One_Card_Sell_Amt() {
    return One_Card_Sell_Amt;
  }
  public void set_One_Card_Sell_Amt(java.math.BigDecimal One_Card_Sell_Amt) {
    this.One_Card_Sell_Amt = One_Card_Sell_Amt;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Sell_Amt(java.math.BigDecimal One_Card_Sell_Amt) {
    this.One_Card_Sell_Amt = One_Card_Sell_Amt;
    return this;
  }
  private java.math.BigDecimal One_Card_Rechange_Amt;
  public java.math.BigDecimal get_One_Card_Rechange_Amt() {
    return One_Card_Rechange_Amt;
  }
  public void set_One_Card_Rechange_Amt(java.math.BigDecimal One_Card_Rechange_Amt) {
    this.One_Card_Rechange_Amt = One_Card_Rechange_Amt;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Rechange_Amt(java.math.BigDecimal One_Card_Rechange_Amt) {
    this.One_Card_Rechange_Amt = One_Card_Rechange_Amt;
    return this;
  }
  private java.math.BigDecimal One_Ktk_Income_Amt;
  public java.math.BigDecimal get_One_Ktk_Income_Amt() {
    return One_Ktk_Income_Amt;
  }
  public void set_One_Ktk_Income_Amt(java.math.BigDecimal One_Ktk_Income_Amt) {
    this.One_Ktk_Income_Amt = One_Ktk_Income_Amt;
  }
  public T98_TKT_SELL_D_STAT with_One_Ktk_Income_Amt(java.math.BigDecimal One_Ktk_Income_Amt) {
    this.One_Ktk_Income_Amt = One_Ktk_Income_Amt;
    return this;
  }
  private java.math.BigDecimal One_Card_Income_Amt;
  public java.math.BigDecimal get_One_Card_Income_Amt() {
    return One_Card_Income_Amt;
  }
  public void set_One_Card_Income_Amt(java.math.BigDecimal One_Card_Income_Amt) {
    this.One_Card_Income_Amt = One_Card_Income_Amt;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Income_Amt(java.math.BigDecimal One_Card_Income_Amt) {
    this.One_Card_Income_Amt = One_Card_Income_Amt;
    return this;
  }
  private java.math.BigDecimal One_Ktk_Income_Ratio;
  public java.math.BigDecimal get_One_Ktk_Income_Ratio() {
    return One_Ktk_Income_Ratio;
  }
  public void set_One_Ktk_Income_Ratio(java.math.BigDecimal One_Ktk_Income_Ratio) {
    this.One_Ktk_Income_Ratio = One_Ktk_Income_Ratio;
  }
  public T98_TKT_SELL_D_STAT with_One_Ktk_Income_Ratio(java.math.BigDecimal One_Ktk_Income_Ratio) {
    this.One_Ktk_Income_Ratio = One_Ktk_Income_Ratio;
    return this;
  }
  private java.math.BigDecimal One_Card_Income_Ratio;
  public java.math.BigDecimal get_One_Card_Income_Ratio() {
    return One_Card_Income_Ratio;
  }
  public void set_One_Card_Income_Ratio(java.math.BigDecimal One_Card_Income_Ratio) {
    this.One_Card_Income_Ratio = One_Card_Income_Ratio;
  }
  public T98_TKT_SELL_D_STAT with_One_Card_Income_Ratio(java.math.BigDecimal One_Card_Income_Ratio) {
    this.One_Card_Income_Ratio = One_Card_Income_Ratio;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_SELL_D_STAT)) {
      return false;
    }
    T98_TKT_SELL_D_STAT that = (T98_TKT_SELL_D_STAT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.One_Ktk_Sell_Cnt == null ? that.One_Ktk_Sell_Cnt == null : this.One_Ktk_Sell_Cnt.equals(that.One_Ktk_Sell_Cnt));
    equal = equal && (this.One_Ktk_Sell_Amt == null ? that.One_Ktk_Sell_Amt == null : this.One_Ktk_Sell_Amt.equals(that.One_Ktk_Sell_Amt));
    equal = equal && (this.One_Card_Sell_Cnt == null ? that.One_Card_Sell_Cnt == null : this.One_Card_Sell_Cnt.equals(that.One_Card_Sell_Cnt));
    equal = equal && (this.One_Card_Rechange_Cnt == null ? that.One_Card_Rechange_Cnt == null : this.One_Card_Rechange_Cnt.equals(that.One_Card_Rechange_Cnt));
    equal = equal && (this.One_Card_Sell_Amt == null ? that.One_Card_Sell_Amt == null : this.One_Card_Sell_Amt.equals(that.One_Card_Sell_Amt));
    equal = equal && (this.One_Card_Rechange_Amt == null ? that.One_Card_Rechange_Amt == null : this.One_Card_Rechange_Amt.equals(that.One_Card_Rechange_Amt));
    equal = equal && (this.One_Ktk_Income_Amt == null ? that.One_Ktk_Income_Amt == null : this.One_Ktk_Income_Amt.equals(that.One_Ktk_Income_Amt));
    equal = equal && (this.One_Card_Income_Amt == null ? that.One_Card_Income_Amt == null : this.One_Card_Income_Amt.equals(that.One_Card_Income_Amt));
    equal = equal && (this.One_Ktk_Income_Ratio == null ? that.One_Ktk_Income_Ratio == null : this.One_Ktk_Income_Ratio.equals(that.One_Ktk_Income_Ratio));
    equal = equal && (this.One_Card_Income_Ratio == null ? that.One_Card_Income_Ratio == null : this.One_Card_Income_Ratio.equals(that.One_Card_Income_Ratio));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_SELL_D_STAT)) {
      return false;
    }
    T98_TKT_SELL_D_STAT that = (T98_TKT_SELL_D_STAT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.One_Ktk_Sell_Cnt == null ? that.One_Ktk_Sell_Cnt == null : this.One_Ktk_Sell_Cnt.equals(that.One_Ktk_Sell_Cnt));
    equal = equal && (this.One_Ktk_Sell_Amt == null ? that.One_Ktk_Sell_Amt == null : this.One_Ktk_Sell_Amt.equals(that.One_Ktk_Sell_Amt));
    equal = equal && (this.One_Card_Sell_Cnt == null ? that.One_Card_Sell_Cnt == null : this.One_Card_Sell_Cnt.equals(that.One_Card_Sell_Cnt));
    equal = equal && (this.One_Card_Rechange_Cnt == null ? that.One_Card_Rechange_Cnt == null : this.One_Card_Rechange_Cnt.equals(that.One_Card_Rechange_Cnt));
    equal = equal && (this.One_Card_Sell_Amt == null ? that.One_Card_Sell_Amt == null : this.One_Card_Sell_Amt.equals(that.One_Card_Sell_Amt));
    equal = equal && (this.One_Card_Rechange_Amt == null ? that.One_Card_Rechange_Amt == null : this.One_Card_Rechange_Amt.equals(that.One_Card_Rechange_Amt));
    equal = equal && (this.One_Ktk_Income_Amt == null ? that.One_Ktk_Income_Amt == null : this.One_Ktk_Income_Amt.equals(that.One_Ktk_Income_Amt));
    equal = equal && (this.One_Card_Income_Amt == null ? that.One_Card_Income_Amt == null : this.One_Card_Income_Amt.equals(that.One_Card_Income_Amt));
    equal = equal && (this.One_Ktk_Income_Ratio == null ? that.One_Ktk_Income_Ratio == null : this.One_Ktk_Income_Ratio.equals(that.One_Ktk_Income_Ratio));
    equal = equal && (this.One_Card_Income_Ratio == null ? that.One_Card_Income_Ratio == null : this.One_Card_Income_Ratio.equals(that.One_Card_Income_Ratio));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.One_Ktk_Sell_Cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.One_Ktk_Sell_Amt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.One_Card_Sell_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.One_Card_Rechange_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.One_Card_Sell_Amt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.One_Card_Rechange_Amt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.One_Ktk_Income_Amt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.One_Card_Income_Amt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.One_Ktk_Income_Ratio = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.One_Card_Income_Ratio = JdbcWritableBridge.readBigDecimal(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.One_Ktk_Sell_Cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.One_Ktk_Sell_Amt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.One_Card_Sell_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.One_Card_Rechange_Cnt = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.One_Card_Sell_Amt = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.One_Card_Rechange_Amt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.One_Ktk_Income_Amt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.One_Card_Income_Amt = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.One_Ktk_Income_Ratio = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.One_Card_Income_Ratio = JdbcWritableBridge.readBigDecimal(13, __dbResults);
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
    JdbcWritableBridge.writeString(Station_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Sell_Cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Sell_Amt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Sell_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Rechange_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Sell_Amt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Rechange_Amt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Income_Amt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Income_Amt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Income_Ratio, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Income_Ratio, 13 + __off, 3, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Sell_Cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Sell_Amt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Sell_Cnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Rechange_Cnt, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Sell_Amt, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Rechange_Amt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Income_Amt, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Income_Amt, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Ktk_Income_Ratio, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(One_Card_Income_Ratio, 13 + __off, 3, __dbStmt);
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
        this.Station_ID = null;
    } else {
    this.Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Ktk_Sell_Cnt = null;
    } else {
    this.One_Ktk_Sell_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Ktk_Sell_Amt = null;
    } else {
    this.One_Ktk_Sell_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Sell_Cnt = null;
    } else {
    this.One_Card_Sell_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Rechange_Cnt = null;
    } else {
    this.One_Card_Rechange_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Sell_Amt = null;
    } else {
    this.One_Card_Sell_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Rechange_Amt = null;
    } else {
    this.One_Card_Rechange_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Ktk_Income_Amt = null;
    } else {
    this.One_Ktk_Income_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Income_Amt = null;
    } else {
    this.One_Card_Income_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Ktk_Income_Ratio = null;
    } else {
    this.One_Ktk_Income_Ratio = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.One_Card_Income_Ratio = null;
    } else {
    this.One_Card_Income_Ratio = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.One_Ktk_Sell_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Sell_Cnt, __dataOut);
    }
    if (null == this.One_Ktk_Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Sell_Amt, __dataOut);
    }
    if (null == this.One_Card_Sell_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Sell_Cnt, __dataOut);
    }
    if (null == this.One_Card_Rechange_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Rechange_Cnt, __dataOut);
    }
    if (null == this.One_Card_Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Sell_Amt, __dataOut);
    }
    if (null == this.One_Card_Rechange_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Rechange_Amt, __dataOut);
    }
    if (null == this.One_Ktk_Income_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Income_Amt, __dataOut);
    }
    if (null == this.One_Card_Income_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Income_Amt, __dataOut);
    }
    if (null == this.One_Ktk_Income_Ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Income_Ratio, __dataOut);
    }
    if (null == this.One_Card_Income_Ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Income_Ratio, __dataOut);
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
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.One_Ktk_Sell_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Sell_Cnt, __dataOut);
    }
    if (null == this.One_Ktk_Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Sell_Amt, __dataOut);
    }
    if (null == this.One_Card_Sell_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Sell_Cnt, __dataOut);
    }
    if (null == this.One_Card_Rechange_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Rechange_Cnt, __dataOut);
    }
    if (null == this.One_Card_Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Sell_Amt, __dataOut);
    }
    if (null == this.One_Card_Rechange_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Rechange_Amt, __dataOut);
    }
    if (null == this.One_Ktk_Income_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Income_Amt, __dataOut);
    }
    if (null == this.One_Card_Income_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Income_Amt, __dataOut);
    }
    if (null == this.One_Ktk_Income_Ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Ktk_Income_Ratio, __dataOut);
    }
    if (null == this.One_Card_Income_Ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.One_Card_Income_Ratio, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Sell_Cnt==null?"\\N":One_Ktk_Sell_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Sell_Amt==null?"\\N":One_Ktk_Sell_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Sell_Cnt==null?"\\N":One_Card_Sell_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Rechange_Cnt==null?"\\N":One_Card_Rechange_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Sell_Amt==null?"\\N":One_Card_Sell_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Rechange_Amt==null?"\\N":One_Card_Rechange_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Income_Amt==null?"\\N":One_Ktk_Income_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Income_Amt==null?"\\N":One_Card_Income_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Income_Ratio==null?"\\N":One_Ktk_Income_Ratio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Income_Ratio==null?"\\N":One_Card_Income_Ratio.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Sell_Cnt==null?"\\N":One_Ktk_Sell_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Sell_Amt==null?"\\N":One_Ktk_Sell_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Sell_Cnt==null?"\\N":One_Card_Sell_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Rechange_Cnt==null?"\\N":One_Card_Rechange_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Sell_Amt==null?"\\N":One_Card_Sell_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Rechange_Amt==null?"\\N":One_Card_Rechange_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Income_Amt==null?"\\N":One_Ktk_Income_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Income_Amt==null?"\\N":One_Card_Income_Amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Ktk_Income_Ratio==null?"\\N":One_Ktk_Income_Ratio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(One_Card_Income_Ratio==null?"\\N":One_Card_Income_Ratio.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Sell_Cnt = null; } else {
      this.One_Ktk_Sell_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Sell_Amt = null; } else {
      this.One_Ktk_Sell_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Sell_Cnt = null; } else {
      this.One_Card_Sell_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Rechange_Cnt = null; } else {
      this.One_Card_Rechange_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Sell_Amt = null; } else {
      this.One_Card_Sell_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Rechange_Amt = null; } else {
      this.One_Card_Rechange_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Income_Amt = null; } else {
      this.One_Ktk_Income_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Income_Amt = null; } else {
      this.One_Card_Income_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Income_Ratio = null; } else {
      this.One_Ktk_Income_Ratio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Income_Ratio = null; } else {
      this.One_Card_Income_Ratio = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Sell_Cnt = null; } else {
      this.One_Ktk_Sell_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Sell_Amt = null; } else {
      this.One_Ktk_Sell_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Sell_Cnt = null; } else {
      this.One_Card_Sell_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Rechange_Cnt = null; } else {
      this.One_Card_Rechange_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Sell_Amt = null; } else {
      this.One_Card_Sell_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Rechange_Amt = null; } else {
      this.One_Card_Rechange_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Income_Amt = null; } else {
      this.One_Ktk_Income_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Income_Amt = null; } else {
      this.One_Card_Income_Amt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Ktk_Income_Ratio = null; } else {
      this.One_Ktk_Income_Ratio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.One_Card_Income_Ratio = null; } else {
      this.One_Card_Income_Ratio = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TKT_SELL_D_STAT o = (T98_TKT_SELL_D_STAT) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TKT_SELL_D_STAT o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("One_Ktk_Sell_Cnt", this.One_Ktk_Sell_Cnt);
    __sqoop$field_map.put("One_Ktk_Sell_Amt", this.One_Ktk_Sell_Amt);
    __sqoop$field_map.put("One_Card_Sell_Cnt", this.One_Card_Sell_Cnt);
    __sqoop$field_map.put("One_Card_Rechange_Cnt", this.One_Card_Rechange_Cnt);
    __sqoop$field_map.put("One_Card_Sell_Amt", this.One_Card_Sell_Amt);
    __sqoop$field_map.put("One_Card_Rechange_Amt", this.One_Card_Rechange_Amt);
    __sqoop$field_map.put("One_Ktk_Income_Amt", this.One_Ktk_Income_Amt);
    __sqoop$field_map.put("One_Card_Income_Amt", this.One_Card_Income_Amt);
    __sqoop$field_map.put("One_Ktk_Income_Ratio", this.One_Ktk_Income_Ratio);
    __sqoop$field_map.put("One_Card_Income_Ratio", this.One_Card_Income_Ratio);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("One_Ktk_Sell_Cnt", this.One_Ktk_Sell_Cnt);
    __sqoop$field_map.put("One_Ktk_Sell_Amt", this.One_Ktk_Sell_Amt);
    __sqoop$field_map.put("One_Card_Sell_Cnt", this.One_Card_Sell_Cnt);
    __sqoop$field_map.put("One_Card_Rechange_Cnt", this.One_Card_Rechange_Cnt);
    __sqoop$field_map.put("One_Card_Sell_Amt", this.One_Card_Sell_Amt);
    __sqoop$field_map.put("One_Card_Rechange_Amt", this.One_Card_Rechange_Amt);
    __sqoop$field_map.put("One_Ktk_Income_Amt", this.One_Ktk_Income_Amt);
    __sqoop$field_map.put("One_Card_Income_Amt", this.One_Card_Income_Amt);
    __sqoop$field_map.put("One_Ktk_Income_Ratio", this.One_Ktk_Income_Ratio);
    __sqoop$field_map.put("One_Card_Income_Ratio", this.One_Card_Income_Ratio);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
