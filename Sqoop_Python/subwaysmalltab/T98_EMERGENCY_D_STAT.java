// ORM class for table 'T98_EMERGENCY_D_STAT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:49:57 CST 2020
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

public class T98_EMERGENCY_D_STAT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Line_ID = (String)value;
      }
    });
    setters.put("Emergency_Event_Spcl_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Emergency_Event_Spcl_Cd = (String)value;
      }
    });
    setters.put("Emergency_Event_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Emergency_Event_Type_Cd = (String)value;
      }
    });
    setters.put("Emergency_Event_Cate_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Emergency_Event_Cate_Cd = (String)value;
      }
    });
    setters.put("Interrupt_Main_Line_Opr_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_EMERGENCY_D_STAT.this.Interrupt_Main_Line_Opr_Tm = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_EMERGENCY_D_STAT() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_EMERGENCY_D_STAT with_Stat_Dt(java.sql.Date Stat_Dt) {
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
  public T98_EMERGENCY_D_STAT with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Emergency_Event_Spcl_Cd;
  public String get_Emergency_Event_Spcl_Cd() {
    return Emergency_Event_Spcl_Cd;
  }
  public void set_Emergency_Event_Spcl_Cd(String Emergency_Event_Spcl_Cd) {
    this.Emergency_Event_Spcl_Cd = Emergency_Event_Spcl_Cd;
  }
  public T98_EMERGENCY_D_STAT with_Emergency_Event_Spcl_Cd(String Emergency_Event_Spcl_Cd) {
    this.Emergency_Event_Spcl_Cd = Emergency_Event_Spcl_Cd;
    return this;
  }
  private String Emergency_Event_Type_Cd;
  public String get_Emergency_Event_Type_Cd() {
    return Emergency_Event_Type_Cd;
  }
  public void set_Emergency_Event_Type_Cd(String Emergency_Event_Type_Cd) {
    this.Emergency_Event_Type_Cd = Emergency_Event_Type_Cd;
  }
  public T98_EMERGENCY_D_STAT with_Emergency_Event_Type_Cd(String Emergency_Event_Type_Cd) {
    this.Emergency_Event_Type_Cd = Emergency_Event_Type_Cd;
    return this;
  }
  private String Emergency_Event_Cate_Cd;
  public String get_Emergency_Event_Cate_Cd() {
    return Emergency_Event_Cate_Cd;
  }
  public void set_Emergency_Event_Cate_Cd(String Emergency_Event_Cate_Cd) {
    this.Emergency_Event_Cate_Cd = Emergency_Event_Cate_Cd;
  }
  public T98_EMERGENCY_D_STAT with_Emergency_Event_Cate_Cd(String Emergency_Event_Cate_Cd) {
    this.Emergency_Event_Cate_Cd = Emergency_Event_Cate_Cd;
    return this;
  }
  private java.math.BigDecimal Interrupt_Main_Line_Opr_Tm;
  public java.math.BigDecimal get_Interrupt_Main_Line_Opr_Tm() {
    return Interrupt_Main_Line_Opr_Tm;
  }
  public void set_Interrupt_Main_Line_Opr_Tm(java.math.BigDecimal Interrupt_Main_Line_Opr_Tm) {
    this.Interrupt_Main_Line_Opr_Tm = Interrupt_Main_Line_Opr_Tm;
  }
  public T98_EMERGENCY_D_STAT with_Interrupt_Main_Line_Opr_Tm(java.math.BigDecimal Interrupt_Main_Line_Opr_Tm) {
    this.Interrupt_Main_Line_Opr_Tm = Interrupt_Main_Line_Opr_Tm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_EMERGENCY_D_STAT)) {
      return false;
    }
    T98_EMERGENCY_D_STAT that = (T98_EMERGENCY_D_STAT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Emergency_Event_Spcl_Cd == null ? that.Emergency_Event_Spcl_Cd == null : this.Emergency_Event_Spcl_Cd.equals(that.Emergency_Event_Spcl_Cd));
    equal = equal && (this.Emergency_Event_Type_Cd == null ? that.Emergency_Event_Type_Cd == null : this.Emergency_Event_Type_Cd.equals(that.Emergency_Event_Type_Cd));
    equal = equal && (this.Emergency_Event_Cate_Cd == null ? that.Emergency_Event_Cate_Cd == null : this.Emergency_Event_Cate_Cd.equals(that.Emergency_Event_Cate_Cd));
    equal = equal && (this.Interrupt_Main_Line_Opr_Tm == null ? that.Interrupt_Main_Line_Opr_Tm == null : this.Interrupt_Main_Line_Opr_Tm.equals(that.Interrupt_Main_Line_Opr_Tm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_EMERGENCY_D_STAT)) {
      return false;
    }
    T98_EMERGENCY_D_STAT that = (T98_EMERGENCY_D_STAT) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Emergency_Event_Spcl_Cd == null ? that.Emergency_Event_Spcl_Cd == null : this.Emergency_Event_Spcl_Cd.equals(that.Emergency_Event_Spcl_Cd));
    equal = equal && (this.Emergency_Event_Type_Cd == null ? that.Emergency_Event_Type_Cd == null : this.Emergency_Event_Type_Cd.equals(that.Emergency_Event_Type_Cd));
    equal = equal && (this.Emergency_Event_Cate_Cd == null ? that.Emergency_Event_Cate_Cd == null : this.Emergency_Event_Cate_Cd.equals(that.Emergency_Event_Cate_Cd));
    equal = equal && (this.Interrupt_Main_Line_Opr_Tm == null ? that.Interrupt_Main_Line_Opr_Tm == null : this.Interrupt_Main_Line_Opr_Tm.equals(that.Interrupt_Main_Line_Opr_Tm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Emergency_Event_Spcl_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Emergency_Event_Type_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Emergency_Event_Cate_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Interrupt_Main_Line_Opr_Tm = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Emergency_Event_Spcl_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Emergency_Event_Type_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Emergency_Event_Cate_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Interrupt_Main_Line_Opr_Tm = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeString(Emergency_Event_Spcl_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Emergency_Event_Type_Cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Emergency_Event_Cate_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Interrupt_Main_Line_Opr_Tm, 6 + __off, 3, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Emergency_Event_Spcl_Cd, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Emergency_Event_Type_Cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Emergency_Event_Cate_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Interrupt_Main_Line_Opr_Tm, 6 + __off, 3, __dbStmt);
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
        this.Emergency_Event_Spcl_Cd = null;
    } else {
    this.Emergency_Event_Spcl_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Emergency_Event_Type_Cd = null;
    } else {
    this.Emergency_Event_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Emergency_Event_Cate_Cd = null;
    } else {
    this.Emergency_Event_Cate_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Interrupt_Main_Line_Opr_Tm = null;
    } else {
    this.Interrupt_Main_Line_Opr_Tm = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Emergency_Event_Spcl_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Spcl_Cd);
    }
    if (null == this.Emergency_Event_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Type_Cd);
    }
    if (null == this.Emergency_Event_Cate_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Cate_Cd);
    }
    if (null == this.Interrupt_Main_Line_Opr_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Interrupt_Main_Line_Opr_Tm, __dataOut);
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
    if (null == this.Emergency_Event_Spcl_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Spcl_Cd);
    }
    if (null == this.Emergency_Event_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Type_Cd);
    }
    if (null == this.Emergency_Event_Cate_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Emergency_Event_Cate_Cd);
    }
    if (null == this.Interrupt_Main_Line_Opr_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Interrupt_Main_Line_Opr_Tm, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Spcl_Cd==null?"\\N":Emergency_Event_Spcl_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Type_Cd==null?"\\N":Emergency_Event_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Cate_Cd==null?"\\N":Emergency_Event_Cate_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Interrupt_Main_Line_Opr_Tm==null?"\\N":Interrupt_Main_Line_Opr_Tm.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Spcl_Cd==null?"\\N":Emergency_Event_Spcl_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Type_Cd==null?"\\N":Emergency_Event_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Emergency_Event_Cate_Cd==null?"\\N":Emergency_Event_Cate_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Interrupt_Main_Line_Opr_Tm==null?"\\N":Interrupt_Main_Line_Opr_Tm.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Emergency_Event_Spcl_Cd = null; } else {
      this.Emergency_Event_Spcl_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Emergency_Event_Type_Cd = null; } else {
      this.Emergency_Event_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Emergency_Event_Cate_Cd = null; } else {
      this.Emergency_Event_Cate_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Interrupt_Main_Line_Opr_Tm = null; } else {
      this.Interrupt_Main_Line_Opr_Tm = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Emergency_Event_Spcl_Cd = null; } else {
      this.Emergency_Event_Spcl_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Emergency_Event_Type_Cd = null; } else {
      this.Emergency_Event_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Emergency_Event_Cate_Cd = null; } else {
      this.Emergency_Event_Cate_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Interrupt_Main_Line_Opr_Tm = null; } else {
      this.Interrupt_Main_Line_Opr_Tm = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_EMERGENCY_D_STAT o = (T98_EMERGENCY_D_STAT) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_EMERGENCY_D_STAT o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Emergency_Event_Spcl_Cd", this.Emergency_Event_Spcl_Cd);
    __sqoop$field_map.put("Emergency_Event_Type_Cd", this.Emergency_Event_Type_Cd);
    __sqoop$field_map.put("Emergency_Event_Cate_Cd", this.Emergency_Event_Cate_Cd);
    __sqoop$field_map.put("Interrupt_Main_Line_Opr_Tm", this.Interrupt_Main_Line_Opr_Tm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Emergency_Event_Spcl_Cd", this.Emergency_Event_Spcl_Cd);
    __sqoop$field_map.put("Emergency_Event_Type_Cd", this.Emergency_Event_Type_Cd);
    __sqoop$field_map.put("Emergency_Event_Cate_Cd", this.Emergency_Event_Cate_Cd);
    __sqoop$field_map.put("Interrupt_Main_Line_Opr_Tm", this.Interrupt_Main_Line_Opr_Tm);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
