// ORM class for table 'T99_STAT_PAYMENT_CHANNEL_CD'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 02 17:18:46 CST 2020
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

public class T99_STAT_PAYMENT_CHANNEL_CD extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("payment_channel_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.payment_channel_Cd = (String)value;
      }
    });
    setters.put("payment_channel_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.payment_channel_name = (String)value;
      }
    });
    setters.put("Payment_channel_type_cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.Payment_channel_type_cd = (String)value;
      }
    });
    setters.put("onoff_line_type_cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.onoff_line_type_cd = (String)value;
      }
    });
    setters.put("Effect_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.Effect_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Invalid_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_PAYMENT_CHANNEL_CD.this.Invalid_Dt = (java.sql.Date)value;
      }
    });
  }
  public T99_STAT_PAYMENT_CHANNEL_CD() {
    init0();
  }
  private String payment_channel_Cd;
  public String get_payment_channel_Cd() {
    return payment_channel_Cd;
  }
  public void set_payment_channel_Cd(String payment_channel_Cd) {
    this.payment_channel_Cd = payment_channel_Cd;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_payment_channel_Cd(String payment_channel_Cd) {
    this.payment_channel_Cd = payment_channel_Cd;
    return this;
  }
  private String payment_channel_name;
  public String get_payment_channel_name() {
    return payment_channel_name;
  }
  public void set_payment_channel_name(String payment_channel_name) {
    this.payment_channel_name = payment_channel_name;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_payment_channel_name(String payment_channel_name) {
    this.payment_channel_name = payment_channel_name;
    return this;
  }
  private String Payment_channel_type_cd;
  public String get_Payment_channel_type_cd() {
    return Payment_channel_type_cd;
  }
  public void set_Payment_channel_type_cd(String Payment_channel_type_cd) {
    this.Payment_channel_type_cd = Payment_channel_type_cd;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_Payment_channel_type_cd(String Payment_channel_type_cd) {
    this.Payment_channel_type_cd = Payment_channel_type_cd;
    return this;
  }
  private String onoff_line_type_cd;
  public String get_onoff_line_type_cd() {
    return onoff_line_type_cd;
  }
  public void set_onoff_line_type_cd(String onoff_line_type_cd) {
    this.onoff_line_type_cd = onoff_line_type_cd;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_onoff_line_type_cd(String onoff_line_type_cd) {
    this.onoff_line_type_cd = onoff_line_type_cd;
    return this;
  }
  private java.sql.Date Effect_Dt;
  public java.sql.Date get_Effect_Dt() {
    return Effect_Dt;
  }
  public void set_Effect_Dt(java.sql.Date Effect_Dt) {
    this.Effect_Dt = Effect_Dt;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_Effect_Dt(java.sql.Date Effect_Dt) {
    this.Effect_Dt = Effect_Dt;
    return this;
  }
  private java.sql.Date Invalid_Dt;
  public java.sql.Date get_Invalid_Dt() {
    return Invalid_Dt;
  }
  public void set_Invalid_Dt(java.sql.Date Invalid_Dt) {
    this.Invalid_Dt = Invalid_Dt;
  }
  public T99_STAT_PAYMENT_CHANNEL_CD with_Invalid_Dt(java.sql.Date Invalid_Dt) {
    this.Invalid_Dt = Invalid_Dt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_STAT_PAYMENT_CHANNEL_CD)) {
      return false;
    }
    T99_STAT_PAYMENT_CHANNEL_CD that = (T99_STAT_PAYMENT_CHANNEL_CD) o;
    boolean equal = true;
    equal = equal && (this.payment_channel_Cd == null ? that.payment_channel_Cd == null : this.payment_channel_Cd.equals(that.payment_channel_Cd));
    equal = equal && (this.payment_channel_name == null ? that.payment_channel_name == null : this.payment_channel_name.equals(that.payment_channel_name));
    equal = equal && (this.Payment_channel_type_cd == null ? that.Payment_channel_type_cd == null : this.Payment_channel_type_cd.equals(that.Payment_channel_type_cd));
    equal = equal && (this.onoff_line_type_cd == null ? that.onoff_line_type_cd == null : this.onoff_line_type_cd.equals(that.onoff_line_type_cd));
    equal = equal && (this.Effect_Dt == null ? that.Effect_Dt == null : this.Effect_Dt.equals(that.Effect_Dt));
    equal = equal && (this.Invalid_Dt == null ? that.Invalid_Dt == null : this.Invalid_Dt.equals(that.Invalid_Dt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_STAT_PAYMENT_CHANNEL_CD)) {
      return false;
    }
    T99_STAT_PAYMENT_CHANNEL_CD that = (T99_STAT_PAYMENT_CHANNEL_CD) o;
    boolean equal = true;
    equal = equal && (this.payment_channel_Cd == null ? that.payment_channel_Cd == null : this.payment_channel_Cd.equals(that.payment_channel_Cd));
    equal = equal && (this.payment_channel_name == null ? that.payment_channel_name == null : this.payment_channel_name.equals(that.payment_channel_name));
    equal = equal && (this.Payment_channel_type_cd == null ? that.Payment_channel_type_cd == null : this.Payment_channel_type_cd.equals(that.Payment_channel_type_cd));
    equal = equal && (this.onoff_line_type_cd == null ? that.onoff_line_type_cd == null : this.onoff_line_type_cd.equals(that.onoff_line_type_cd));
    equal = equal && (this.Effect_Dt == null ? that.Effect_Dt == null : this.Effect_Dt.equals(that.Effect_Dt));
    equal = equal && (this.Invalid_Dt == null ? that.Invalid_Dt == null : this.Invalid_Dt.equals(that.Invalid_Dt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.payment_channel_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.payment_channel_name = JdbcWritableBridge.readString(2, __dbResults);
    this.Payment_channel_type_cd = JdbcWritableBridge.readString(3, __dbResults);
    this.onoff_line_type_cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Effect_Dt = JdbcWritableBridge.readDate(5, __dbResults);
    this.Invalid_Dt = JdbcWritableBridge.readDate(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.payment_channel_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.payment_channel_name = JdbcWritableBridge.readString(2, __dbResults);
    this.Payment_channel_type_cd = JdbcWritableBridge.readString(3, __dbResults);
    this.onoff_line_type_cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Effect_Dt = JdbcWritableBridge.readDate(5, __dbResults);
    this.Invalid_Dt = JdbcWritableBridge.readDate(6, __dbResults);
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
    JdbcWritableBridge.writeString(payment_channel_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(payment_channel_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Payment_channel_type_cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(onoff_line_type_cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Effect_Dt, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Invalid_Dt, 6 + __off, 91, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(payment_channel_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(payment_channel_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Payment_channel_type_cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(onoff_line_type_cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Effect_Dt, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Invalid_Dt, 6 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.payment_channel_Cd = null;
    } else {
    this.payment_channel_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payment_channel_name = null;
    } else {
    this.payment_channel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Payment_channel_type_cd = null;
    } else {
    this.Payment_channel_type_cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.onoff_line_type_cd = null;
    } else {
    this.onoff_line_type_cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Effect_Dt = null;
    } else {
    this.Effect_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Invalid_Dt = null;
    } else {
    this.Invalid_Dt = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.payment_channel_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_channel_Cd);
    }
    if (null == this.payment_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_channel_name);
    }
    if (null == this.Payment_channel_type_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Payment_channel_type_cd);
    }
    if (null == this.onoff_line_type_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, onoff_line_type_cd);
    }
    if (null == this.Effect_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Effect_Dt.getTime());
    }
    if (null == this.Invalid_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Invalid_Dt.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.payment_channel_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_channel_Cd);
    }
    if (null == this.payment_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_channel_name);
    }
    if (null == this.Payment_channel_type_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Payment_channel_type_cd);
    }
    if (null == this.onoff_line_type_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, onoff_line_type_cd);
    }
    if (null == this.Effect_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Effect_Dt.getTime());
    }
    if (null == this.Invalid_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Invalid_Dt.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(payment_channel_Cd==null?"\\N":payment_channel_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_channel_name==null?"\\N":payment_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Payment_channel_type_cd==null?"\\N":Payment_channel_type_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(onoff_line_type_cd==null?"\\N":onoff_line_type_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Effect_Dt==null?"\\N":"" + Effect_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Invalid_Dt==null?"\\N":"" + Invalid_Dt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(payment_channel_Cd==null?"\\N":payment_channel_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_channel_name==null?"\\N":payment_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Payment_channel_type_cd==null?"\\N":Payment_channel_type_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(onoff_line_type_cd==null?"\\N":onoff_line_type_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Effect_Dt==null?"\\N":"" + Effect_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Invalid_Dt==null?"\\N":"" + Invalid_Dt, delimiters));
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
    if (__cur_str.equals("null")) { this.payment_channel_Cd = null; } else {
      this.payment_channel_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.payment_channel_name = null; } else {
      this.payment_channel_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Payment_channel_type_cd = null; } else {
      this.Payment_channel_type_cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.onoff_line_type_cd = null; } else {
      this.onoff_line_type_cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Effect_Dt = null; } else {
      this.Effect_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Invalid_Dt = null; } else {
      this.Invalid_Dt = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.payment_channel_Cd = null; } else {
      this.payment_channel_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.payment_channel_name = null; } else {
      this.payment_channel_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Payment_channel_type_cd = null; } else {
      this.Payment_channel_type_cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.onoff_line_type_cd = null; } else {
      this.onoff_line_type_cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Effect_Dt = null; } else {
      this.Effect_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Invalid_Dt = null; } else {
      this.Invalid_Dt = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T99_STAT_PAYMENT_CHANNEL_CD o = (T99_STAT_PAYMENT_CHANNEL_CD) super.clone();
    o.Effect_Dt = (o.Effect_Dt != null) ? (java.sql.Date) o.Effect_Dt.clone() : null;
    o.Invalid_Dt = (o.Invalid_Dt != null) ? (java.sql.Date) o.Invalid_Dt.clone() : null;
    return o;
  }

  public void clone0(T99_STAT_PAYMENT_CHANNEL_CD o) throws CloneNotSupportedException {
    o.Effect_Dt = (o.Effect_Dt != null) ? (java.sql.Date) o.Effect_Dt.clone() : null;
    o.Invalid_Dt = (o.Invalid_Dt != null) ? (java.sql.Date) o.Invalid_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("payment_channel_Cd", this.payment_channel_Cd);
    __sqoop$field_map.put("payment_channel_name", this.payment_channel_name);
    __sqoop$field_map.put("Payment_channel_type_cd", this.Payment_channel_type_cd);
    __sqoop$field_map.put("onoff_line_type_cd", this.onoff_line_type_cd);
    __sqoop$field_map.put("Effect_Dt", this.Effect_Dt);
    __sqoop$field_map.put("Invalid_Dt", this.Invalid_Dt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("payment_channel_Cd", this.payment_channel_Cd);
    __sqoop$field_map.put("payment_channel_name", this.payment_channel_name);
    __sqoop$field_map.put("Payment_channel_type_cd", this.Payment_channel_type_cd);
    __sqoop$field_map.put("onoff_line_type_cd", this.onoff_line_type_cd);
    __sqoop$field_map.put("Effect_Dt", this.Effect_Dt);
    __sqoop$field_map.put("Invalid_Dt", this.Invalid_Dt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
