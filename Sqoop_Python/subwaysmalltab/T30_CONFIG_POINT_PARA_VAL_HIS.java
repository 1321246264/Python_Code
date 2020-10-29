// ORM class for table 'T30_CONFIG_POINT_PARA_VAL_HIS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Jun 28 11:30:00 CST 2020
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

public class T30_CONFIG_POINT_PARA_VAL_HIS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Config_Point_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Config_Point_ID = (String)value;
      }
    });
    setters.put("Parameter_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Parameter_ID = (String)value;
      }
    });
    setters.put("Parameter_Serial_No", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Parameter_Serial_No = (java.math.BigDecimal)value;
      }
    });
    setters.put("Start_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Start_Tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("Parameter_Value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Parameter_Value = (String)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("End_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T30_CONFIG_POINT_PARA_VAL_HIS.this.End_Tm = (java.sql.Timestamp)value;
      }
    });
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS() {
    init0();
  }
  private String Config_Point_ID;
  public String get_Config_Point_ID() {
    return Config_Point_ID;
  }
  public void set_Config_Point_ID(String Config_Point_ID) {
    this.Config_Point_ID = Config_Point_ID;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Config_Point_ID(String Config_Point_ID) {
    this.Config_Point_ID = Config_Point_ID;
    return this;
  }
  private String Parameter_ID;
  public String get_Parameter_ID() {
    return Parameter_ID;
  }
  public void set_Parameter_ID(String Parameter_ID) {
    this.Parameter_ID = Parameter_ID;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Parameter_ID(String Parameter_ID) {
    this.Parameter_ID = Parameter_ID;
    return this;
  }
  private java.math.BigDecimal Parameter_Serial_No;
  public java.math.BigDecimal get_Parameter_Serial_No() {
    return Parameter_Serial_No;
  }
  public void set_Parameter_Serial_No(java.math.BigDecimal Parameter_Serial_No) {
    this.Parameter_Serial_No = Parameter_Serial_No;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Parameter_Serial_No(java.math.BigDecimal Parameter_Serial_No) {
    this.Parameter_Serial_No = Parameter_Serial_No;
    return this;
  }
  private java.sql.Timestamp Start_Tm;
  public java.sql.Timestamp get_Start_Tm() {
    return Start_Tm;
  }
  public void set_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
    return this;
  }
  private String Parameter_Value;
  public String get_Parameter_Value() {
    return Parameter_Value;
  }
  public void set_Parameter_Value(String Parameter_Value) {
    this.Parameter_Value = Parameter_Value;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Parameter_Value(String Parameter_Value) {
    this.Parameter_Value = Parameter_Value;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
    return this;
  }
  private java.sql.Timestamp End_Tm;
  public java.sql.Timestamp get_End_Tm() {
    return End_Tm;
  }
  public void set_End_Tm(java.sql.Timestamp End_Tm) {
    this.End_Tm = End_Tm;
  }
  public T30_CONFIG_POINT_PARA_VAL_HIS with_End_Tm(java.sql.Timestamp End_Tm) {
    this.End_Tm = End_Tm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T30_CONFIG_POINT_PARA_VAL_HIS)) {
      return false;
    }
    T30_CONFIG_POINT_PARA_VAL_HIS that = (T30_CONFIG_POINT_PARA_VAL_HIS) o;
    boolean equal = true;
    equal = equal && (this.Config_Point_ID == null ? that.Config_Point_ID == null : this.Config_Point_ID.equals(that.Config_Point_ID));
    equal = equal && (this.Parameter_ID == null ? that.Parameter_ID == null : this.Parameter_ID.equals(that.Parameter_ID));
    equal = equal && (this.Parameter_Serial_No == null ? that.Parameter_Serial_No == null : this.Parameter_Serial_No.equals(that.Parameter_Serial_No));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Parameter_Value == null ? that.Parameter_Value == null : this.Parameter_Value.equals(that.Parameter_Value));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T30_CONFIG_POINT_PARA_VAL_HIS)) {
      return false;
    }
    T30_CONFIG_POINT_PARA_VAL_HIS that = (T30_CONFIG_POINT_PARA_VAL_HIS) o;
    boolean equal = true;
    equal = equal && (this.Config_Point_ID == null ? that.Config_Point_ID == null : this.Config_Point_ID.equals(that.Config_Point_ID));
    equal = equal && (this.Parameter_ID == null ? that.Parameter_ID == null : this.Parameter_ID.equals(that.Parameter_ID));
    equal = equal && (this.Parameter_Serial_No == null ? that.Parameter_Serial_No == null : this.Parameter_Serial_No.equals(that.Parameter_Serial_No));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Parameter_Value == null ? that.Parameter_Value == null : this.Parameter_Value.equals(that.Parameter_Value));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Config_Point_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Parameter_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Parameter_Serial_No = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.Parameter_Value = JdbcWritableBridge.readString(5, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Config_Point_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Parameter_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Parameter_Serial_No = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.Parameter_Value = JdbcWritableBridge.readString(5, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeString(Config_Point_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Parameter_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Parameter_Serial_No, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Parameter_Value, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 7 + __off, 93, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Config_Point_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Parameter_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Parameter_Serial_No, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Parameter_Value, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 7 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Config_Point_ID = null;
    } else {
    this.Config_Point_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Parameter_ID = null;
    } else {
    this.Parameter_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Parameter_Serial_No = null;
    } else {
    this.Parameter_Serial_No = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Tm = null;
    } else {
    this.Start_Tm = new Timestamp(__dataIn.readLong());
    this.Start_Tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Parameter_Value = null;
    } else {
    this.Parameter_Value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Source_Sys_Cd = null;
    } else {
    this.Source_Sys_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.End_Tm = null;
    } else {
    this.End_Tm = new Timestamp(__dataIn.readLong());
    this.End_Tm.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Config_Point_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Config_Point_ID);
    }
    if (null == this.Parameter_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parameter_ID);
    }
    if (null == this.Parameter_Serial_No) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Parameter_Serial_No, __dataOut);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Parameter_Value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parameter_Value);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.End_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Tm.getTime());
    __dataOut.writeInt(this.End_Tm.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Config_Point_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Config_Point_ID);
    }
    if (null == this.Parameter_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parameter_ID);
    }
    if (null == this.Parameter_Serial_No) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Parameter_Serial_No, __dataOut);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Parameter_Value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parameter_Value);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.End_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Tm.getTime());
    __dataOut.writeInt(this.End_Tm.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(Config_Point_ID==null?"\\N":Config_Point_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_ID==null?"\\N":Parameter_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_Serial_No==null?"\\N":Parameter_Serial_No.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_Value==null?"\\N":Parameter_Value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Tm==null?"\\N":"" + End_Tm, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Config_Point_ID==null?"\\N":Config_Point_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_ID==null?"\\N":Parameter_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_Serial_No==null?"\\N":Parameter_Serial_No.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parameter_Value==null?"\\N":Parameter_Value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Tm==null?"\\N":"" + End_Tm, delimiters));
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
    if (__cur_str.equals("null")) { this.Config_Point_ID = null; } else {
      this.Config_Point_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parameter_ID = null; } else {
      this.Parameter_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Parameter_Serial_No = null; } else {
      this.Parameter_Serial_No = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parameter_Value = null; } else {
      this.Parameter_Value = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Tm = null; } else {
      this.End_Tm = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Config_Point_ID = null; } else {
      this.Config_Point_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parameter_ID = null; } else {
      this.Parameter_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Parameter_Serial_No = null; } else {
      this.Parameter_Serial_No = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parameter_Value = null; } else {
      this.Parameter_Value = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Tm = null; } else {
      this.End_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T30_CONFIG_POINT_PARA_VAL_HIS o = (T30_CONFIG_POINT_PARA_VAL_HIS) super.clone();
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
    return o;
  }

  public void clone0(T30_CONFIG_POINT_PARA_VAL_HIS o) throws CloneNotSupportedException {
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Config_Point_ID", this.Config_Point_ID);
    __sqoop$field_map.put("Parameter_ID", this.Parameter_ID);
    __sqoop$field_map.put("Parameter_Serial_No", this.Parameter_Serial_No);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Parameter_Value", this.Parameter_Value);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Config_Point_ID", this.Config_Point_ID);
    __sqoop$field_map.put("Parameter_ID", this.Parameter_ID);
    __sqoop$field_map.put("Parameter_Serial_No", this.Parameter_Serial_No);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Parameter_Value", this.Parameter_Value);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
