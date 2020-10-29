// ORM class for table 'T98_NEAR_TRIP_DATA_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:51:38 CST 2020
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

public class T98_NEAR_TRIP_DATA_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.Line_ID = (String)value;
      }
    });
    setters.put("Actl_Trip_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.Actl_Trip_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("M2_Delay_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.M2_Delay_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("M5_Delay_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.M5_Delay_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Online_Train_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_NEAR_TRIP_DATA_ST.this.Online_Train_Cnt = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_NEAR_TRIP_DATA_ST() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_NEAR_TRIP_DATA_ST with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_NEAR_TRIP_DATA_ST with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private java.math.BigDecimal Actl_Trip_Train_Cnt;
  public java.math.BigDecimal get_Actl_Trip_Train_Cnt() {
    return Actl_Trip_Train_Cnt;
  }
  public void set_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
  }
  public T98_NEAR_TRIP_DATA_ST with_Actl_Trip_Train_Cnt(java.math.BigDecimal Actl_Trip_Train_Cnt) {
    this.Actl_Trip_Train_Cnt = Actl_Trip_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal M2_Delay_Train_Cnt;
  public java.math.BigDecimal get_M2_Delay_Train_Cnt() {
    return M2_Delay_Train_Cnt;
  }
  public void set_M2_Delay_Train_Cnt(java.math.BigDecimal M2_Delay_Train_Cnt) {
    this.M2_Delay_Train_Cnt = M2_Delay_Train_Cnt;
  }
  public T98_NEAR_TRIP_DATA_ST with_M2_Delay_Train_Cnt(java.math.BigDecimal M2_Delay_Train_Cnt) {
    this.M2_Delay_Train_Cnt = M2_Delay_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal M5_Delay_Train_Cnt;
  public java.math.BigDecimal get_M5_Delay_Train_Cnt() {
    return M5_Delay_Train_Cnt;
  }
  public void set_M5_Delay_Train_Cnt(java.math.BigDecimal M5_Delay_Train_Cnt) {
    this.M5_Delay_Train_Cnt = M5_Delay_Train_Cnt;
  }
  public T98_NEAR_TRIP_DATA_ST with_M5_Delay_Train_Cnt(java.math.BigDecimal M5_Delay_Train_Cnt) {
    this.M5_Delay_Train_Cnt = M5_Delay_Train_Cnt;
    return this;
  }
  private java.math.BigDecimal Online_Train_Cnt;
  public java.math.BigDecimal get_Online_Train_Cnt() {
    return Online_Train_Cnt;
  }
  public void set_Online_Train_Cnt(java.math.BigDecimal Online_Train_Cnt) {
    this.Online_Train_Cnt = Online_Train_Cnt;
  }
  public T98_NEAR_TRIP_DATA_ST with_Online_Train_Cnt(java.math.BigDecimal Online_Train_Cnt) {
    this.Online_Train_Cnt = Online_Train_Cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_NEAR_TRIP_DATA_ST)) {
      return false;
    }
    T98_NEAR_TRIP_DATA_ST that = (T98_NEAR_TRIP_DATA_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    equal = equal && (this.M2_Delay_Train_Cnt == null ? that.M2_Delay_Train_Cnt == null : this.M2_Delay_Train_Cnt.equals(that.M2_Delay_Train_Cnt));
    equal = equal && (this.M5_Delay_Train_Cnt == null ? that.M5_Delay_Train_Cnt == null : this.M5_Delay_Train_Cnt.equals(that.M5_Delay_Train_Cnt));
    equal = equal && (this.Online_Train_Cnt == null ? that.Online_Train_Cnt == null : this.Online_Train_Cnt.equals(that.Online_Train_Cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_NEAR_TRIP_DATA_ST)) {
      return false;
    }
    T98_NEAR_TRIP_DATA_ST that = (T98_NEAR_TRIP_DATA_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Actl_Trip_Train_Cnt == null ? that.Actl_Trip_Train_Cnt == null : this.Actl_Trip_Train_Cnt.equals(that.Actl_Trip_Train_Cnt));
    equal = equal && (this.M2_Delay_Train_Cnt == null ? that.M2_Delay_Train_Cnt == null : this.M2_Delay_Train_Cnt.equals(that.M2_Delay_Train_Cnt));
    equal = equal && (this.M5_Delay_Train_Cnt == null ? that.M5_Delay_Train_Cnt == null : this.M5_Delay_Train_Cnt.equals(that.M5_Delay_Train_Cnt));
    equal = equal && (this.Online_Train_Cnt == null ? that.Online_Train_Cnt == null : this.Online_Train_Cnt.equals(that.Online_Train_Cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.M2_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.M5_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Online_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Actl_Trip_Train_Cnt = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.M2_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.M5_Delay_Train_Cnt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Online_Train_Cnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(M2_Delay_Train_Cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(M5_Delay_Train_Cnt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Online_Train_Cnt, 6 + __off, 3, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Actl_Trip_Train_Cnt, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(M2_Delay_Train_Cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(M5_Delay_Train_Cnt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Online_Train_Cnt, 6 + __off, 3, __dbStmt);
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
        this.Actl_Trip_Train_Cnt = null;
    } else {
    this.Actl_Trip_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.M2_Delay_Train_Cnt = null;
    } else {
    this.M2_Delay_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.M5_Delay_Train_Cnt = null;
    } else {
    this.M5_Delay_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Online_Train_Cnt = null;
    } else {
    this.Online_Train_Cnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.M2_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.M2_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.M5_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.M5_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Online_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Online_Train_Cnt, __dataOut);
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
    if (null == this.Actl_Trip_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Actl_Trip_Train_Cnt, __dataOut);
    }
    if (null == this.M2_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.M2_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.M5_Delay_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.M5_Delay_Train_Cnt, __dataOut);
    }
    if (null == this.Online_Train_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Online_Train_Cnt, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(M2_Delay_Train_Cnt==null?"\\N":M2_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(M5_Delay_Train_Cnt==null?"\\N":M5_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Online_Train_Cnt==null?"\\N":Online_Train_Cnt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Actl_Trip_Train_Cnt==null?"\\N":Actl_Trip_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(M2_Delay_Train_Cnt==null?"\\N":M2_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(M5_Delay_Train_Cnt==null?"\\N":M5_Delay_Train_Cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Online_Train_Cnt==null?"\\N":Online_Train_Cnt.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.M2_Delay_Train_Cnt = null; } else {
      this.M2_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.M5_Delay_Train_Cnt = null; } else {
      this.M5_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Online_Train_Cnt = null; } else {
      this.Online_Train_Cnt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Actl_Trip_Train_Cnt = null; } else {
      this.Actl_Trip_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.M2_Delay_Train_Cnt = null; } else {
      this.M2_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.M5_Delay_Train_Cnt = null; } else {
      this.M5_Delay_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Online_Train_Cnt = null; } else {
      this.Online_Train_Cnt = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_NEAR_TRIP_DATA_ST o = (T98_NEAR_TRIP_DATA_ST) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_NEAR_TRIP_DATA_ST o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
    __sqoop$field_map.put("M2_Delay_Train_Cnt", this.M2_Delay_Train_Cnt);
    __sqoop$field_map.put("M5_Delay_Train_Cnt", this.M5_Delay_Train_Cnt);
    __sqoop$field_map.put("Online_Train_Cnt", this.Online_Train_Cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Actl_Trip_Train_Cnt", this.Actl_Trip_Train_Cnt);
    __sqoop$field_map.put("M2_Delay_Train_Cnt", this.M2_Delay_Train_Cnt);
    __sqoop$field_map.put("M5_Delay_Train_Cnt", this.M5_Delay_Train_Cnt);
    __sqoop$field_map.put("Online_Train_Cnt", this.Online_Train_Cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
