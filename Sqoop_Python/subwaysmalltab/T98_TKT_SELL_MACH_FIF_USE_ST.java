// ORM class for table 'T98_TKT_SELL_MACH_FIF_USE_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 17:34:32 CST 2020
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

public class T98_TKT_SELL_MACH_FIF_USE_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Line_ID = (String)value;
      }
    });
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Station_ID = (String)value;
      }
    });
    setters.put("Fif_Index_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Fif_Index_Cd = (String)value;
      }
    });
    setters.put("Ktk_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Ktk_Cd = (String)value;
      }
    });
    setters.put("Tx_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Tx_Cd = (String)value;
      }
    });
    setters.put("Tx_Sub_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Tx_Sub_Cd = (String)value;
      }
    });
    setters.put("Hardware_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Hardware_Type_Cd = (String)value;
      }
    });
    setters.put("Using_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Using_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Sell_Amt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_SELL_MACH_FIF_USE_ST.this.Sell_Amt = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Line_ID(String Line_ID) {
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
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private String Fif_Index_Cd;
  public String get_Fif_Index_Cd() {
    return Fif_Index_Cd;
  }
  public void set_Fif_Index_Cd(String Fif_Index_Cd) {
    this.Fif_Index_Cd = Fif_Index_Cd;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Fif_Index_Cd(String Fif_Index_Cd) {
    this.Fif_Index_Cd = Fif_Index_Cd;
    return this;
  }
  private String Ktk_Cd;
  public String get_Ktk_Cd() {
    return Ktk_Cd;
  }
  public void set_Ktk_Cd(String Ktk_Cd) {
    this.Ktk_Cd = Ktk_Cd;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Ktk_Cd(String Ktk_Cd) {
    this.Ktk_Cd = Ktk_Cd;
    return this;
  }
  private String Tx_Cd;
  public String get_Tx_Cd() {
    return Tx_Cd;
  }
  public void set_Tx_Cd(String Tx_Cd) {
    this.Tx_Cd = Tx_Cd;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Tx_Cd(String Tx_Cd) {
    this.Tx_Cd = Tx_Cd;
    return this;
  }
  private String Tx_Sub_Cd;
  public String get_Tx_Sub_Cd() {
    return Tx_Sub_Cd;
  }
  public void set_Tx_Sub_Cd(String Tx_Sub_Cd) {
    this.Tx_Sub_Cd = Tx_Sub_Cd;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Tx_Sub_Cd(String Tx_Sub_Cd) {
    this.Tx_Sub_Cd = Tx_Sub_Cd;
    return this;
  }
  private String Hardware_Type_Cd;
  public String get_Hardware_Type_Cd() {
    return Hardware_Type_Cd;
  }
  public void set_Hardware_Type_Cd(String Hardware_Type_Cd) {
    this.Hardware_Type_Cd = Hardware_Type_Cd;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Hardware_Type_Cd(String Hardware_Type_Cd) {
    this.Hardware_Type_Cd = Hardware_Type_Cd;
    return this;
  }
  private java.math.BigDecimal Using_Cnt;
  public java.math.BigDecimal get_Using_Cnt() {
    return Using_Cnt;
  }
  public void set_Using_Cnt(java.math.BigDecimal Using_Cnt) {
    this.Using_Cnt = Using_Cnt;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Using_Cnt(java.math.BigDecimal Using_Cnt) {
    this.Using_Cnt = Using_Cnt;
    return this;
  }
  private java.math.BigDecimal Sell_Amt;
  public java.math.BigDecimal get_Sell_Amt() {
    return Sell_Amt;
  }
  public void set_Sell_Amt(java.math.BigDecimal Sell_Amt) {
    this.Sell_Amt = Sell_Amt;
  }
  public T98_TKT_SELL_MACH_FIF_USE_ST with_Sell_Amt(java.math.BigDecimal Sell_Amt) {
    this.Sell_Amt = Sell_Amt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_SELL_MACH_FIF_USE_ST)) {
      return false;
    }
    T98_TKT_SELL_MACH_FIF_USE_ST that = (T98_TKT_SELL_MACH_FIF_USE_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Fif_Index_Cd == null ? that.Fif_Index_Cd == null : this.Fif_Index_Cd.equals(that.Fif_Index_Cd));
    equal = equal && (this.Ktk_Cd == null ? that.Ktk_Cd == null : this.Ktk_Cd.equals(that.Ktk_Cd));
    equal = equal && (this.Tx_Cd == null ? that.Tx_Cd == null : this.Tx_Cd.equals(that.Tx_Cd));
    equal = equal && (this.Tx_Sub_Cd == null ? that.Tx_Sub_Cd == null : this.Tx_Sub_Cd.equals(that.Tx_Sub_Cd));
    equal = equal && (this.Hardware_Type_Cd == null ? that.Hardware_Type_Cd == null : this.Hardware_Type_Cd.equals(that.Hardware_Type_Cd));
    equal = equal && (this.Using_Cnt == null ? that.Using_Cnt == null : this.Using_Cnt.equals(that.Using_Cnt));
    equal = equal && (this.Sell_Amt == null ? that.Sell_Amt == null : this.Sell_Amt.equals(that.Sell_Amt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_SELL_MACH_FIF_USE_ST)) {
      return false;
    }
    T98_TKT_SELL_MACH_FIF_USE_ST that = (T98_TKT_SELL_MACH_FIF_USE_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Fif_Index_Cd == null ? that.Fif_Index_Cd == null : this.Fif_Index_Cd.equals(that.Fif_Index_Cd));
    equal = equal && (this.Ktk_Cd == null ? that.Ktk_Cd == null : this.Ktk_Cd.equals(that.Ktk_Cd));
    equal = equal && (this.Tx_Cd == null ? that.Tx_Cd == null : this.Tx_Cd.equals(that.Tx_Cd));
    equal = equal && (this.Tx_Sub_Cd == null ? that.Tx_Sub_Cd == null : this.Tx_Sub_Cd.equals(that.Tx_Sub_Cd));
    equal = equal && (this.Hardware_Type_Cd == null ? that.Hardware_Type_Cd == null : this.Hardware_Type_Cd.equals(that.Hardware_Type_Cd));
    equal = equal && (this.Using_Cnt == null ? that.Using_Cnt == null : this.Using_Cnt.equals(that.Using_Cnt));
    equal = equal && (this.Sell_Amt == null ? that.Sell_Amt == null : this.Sell_Amt.equals(that.Sell_Amt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Fif_Index_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Ktk_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Tx_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Tx_Sub_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Hardware_Type_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Using_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Sell_Amt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Fif_Index_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Ktk_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Tx_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Tx_Sub_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.Hardware_Type_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.Using_Cnt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Sell_Amt = JdbcWritableBridge.readBigDecimal(10, __dbResults);
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
    JdbcWritableBridge.writeString(Fif_Index_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Ktk_Cd, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Sub_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Hardware_Type_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Using_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sell_Amt, 10 + __off, 3, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Fif_Index_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Ktk_Cd, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Sub_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Hardware_Type_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Using_Cnt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sell_Amt, 10 + __off, 3, __dbStmt);
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
        this.Fif_Index_Cd = null;
    } else {
    this.Fif_Index_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Ktk_Cd = null;
    } else {
    this.Ktk_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Cd = null;
    } else {
    this.Tx_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Sub_Cd = null;
    } else {
    this.Tx_Sub_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Hardware_Type_Cd = null;
    } else {
    this.Hardware_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Using_Cnt = null;
    } else {
    this.Using_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Sell_Amt = null;
    } else {
    this.Sell_Amt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Fif_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fif_Index_Cd);
    }
    if (null == this.Ktk_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ktk_Cd);
    }
    if (null == this.Tx_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Cd);
    }
    if (null == this.Tx_Sub_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Sub_Cd);
    }
    if (null == this.Hardware_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Hardware_Type_Cd);
    }
    if (null == this.Using_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Using_Cnt, __dataOut);
    }
    if (null == this.Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Sell_Amt, __dataOut);
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
    if (null == this.Fif_Index_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fif_Index_Cd);
    }
    if (null == this.Ktk_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ktk_Cd);
    }
    if (null == this.Tx_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Cd);
    }
    if (null == this.Tx_Sub_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Sub_Cd);
    }
    if (null == this.Hardware_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Hardware_Type_Cd);
    }
    if (null == this.Using_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Using_Cnt, __dataOut);
    }
    if (null == this.Sell_Amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Sell_Amt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Fif_Index_Cd==null?"\\N":Fif_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ktk_Cd==null?"\\N":Ktk_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Cd==null?"\\N":Tx_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Sub_Cd==null?"\\N":Tx_Sub_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Hardware_Type_Cd==null?"\\N":Hardware_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Using_Cnt==null?"\\N":Using_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sell_Amt==null?"\\N":Sell_Amt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Fif_Index_Cd==null?"\\N":Fif_Index_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ktk_Cd==null?"\\N":Ktk_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Cd==null?"\\N":Tx_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Sub_Cd==null?"\\N":Tx_Sub_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Hardware_Type_Cd==null?"\\N":Hardware_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Using_Cnt==null?"\\N":Using_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sell_Amt==null?"\\N":Sell_Amt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Fif_Index_Cd = null; } else {
      this.Fif_Index_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Ktk_Cd = null; } else {
      this.Ktk_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Cd = null; } else {
      this.Tx_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Sub_Cd = null; } else {
      this.Tx_Sub_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Hardware_Type_Cd = null; } else {
      this.Hardware_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Using_Cnt = null; } else {
      this.Using_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sell_Amt = null; } else {
      this.Sell_Amt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Fif_Index_Cd = null; } else {
      this.Fif_Index_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Ktk_Cd = null; } else {
      this.Ktk_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Cd = null; } else {
      this.Tx_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Sub_Cd = null; } else {
      this.Tx_Sub_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Hardware_Type_Cd = null; } else {
      this.Hardware_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Using_Cnt = null; } else {
      this.Using_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sell_Amt = null; } else {
      this.Sell_Amt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TKT_SELL_MACH_FIF_USE_ST o = (T98_TKT_SELL_MACH_FIF_USE_ST) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TKT_SELL_MACH_FIF_USE_ST o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Fif_Index_Cd", this.Fif_Index_Cd);
    __sqoop$field_map.put("Ktk_Cd", this.Ktk_Cd);
    __sqoop$field_map.put("Tx_Cd", this.Tx_Cd);
    __sqoop$field_map.put("Tx_Sub_Cd", this.Tx_Sub_Cd);
    __sqoop$field_map.put("Hardware_Type_Cd", this.Hardware_Type_Cd);
    __sqoop$field_map.put("Using_Cnt", this.Using_Cnt);
    __sqoop$field_map.put("Sell_Amt", this.Sell_Amt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Fif_Index_Cd", this.Fif_Index_Cd);
    __sqoop$field_map.put("Ktk_Cd", this.Ktk_Cd);
    __sqoop$field_map.put("Tx_Cd", this.Tx_Cd);
    __sqoop$field_map.put("Tx_Sub_Cd", this.Tx_Sub_Cd);
    __sqoop$field_map.put("Hardware_Type_Cd", this.Hardware_Type_Cd);
    __sqoop$field_map.put("Using_Cnt", this.Using_Cnt);
    __sqoop$field_map.put("Sell_Amt", this.Sell_Amt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
