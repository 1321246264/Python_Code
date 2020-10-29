// ORM class for table 'T99_SRC_PAY_CHANNEL_RELA_HIS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 02 17:17:03 CST 2020
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

public class T99_SRC_PAY_CHANNEL_RELA_HIS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("payment_channel_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_SRC_PAY_CHANNEL_RELA_HIS.this.payment_channel_Cd = (String)value;
      }
    });
    setters.put("Src_payment_channel_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_SRC_PAY_CHANNEL_RELA_HIS.this.Src_payment_channel_Cd = (String)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_SRC_PAY_CHANNEL_RELA_HIS.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("Effect_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_SRC_PAY_CHANNEL_RELA_HIS.this.Effect_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Invalid_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_SRC_PAY_CHANNEL_RELA_HIS.this.Invalid_Dt = (java.sql.Date)value;
      }
    });
  }
  public T99_SRC_PAY_CHANNEL_RELA_HIS() {
    init0();
  }
  private String payment_channel_Cd;
  public String get_payment_channel_Cd() {
    return payment_channel_Cd;
  }
  public void set_payment_channel_Cd(String payment_channel_Cd) {
    this.payment_channel_Cd = payment_channel_Cd;
  }
  public T99_SRC_PAY_CHANNEL_RELA_HIS with_payment_channel_Cd(String payment_channel_Cd) {
    this.payment_channel_Cd = payment_channel_Cd;
    return this;
  }
  private String Src_payment_channel_Cd;
  public String get_Src_payment_channel_Cd() {
    return Src_payment_channel_Cd;
  }
  public void set_Src_payment_channel_Cd(String Src_payment_channel_Cd) {
    this.Src_payment_channel_Cd = Src_payment_channel_Cd;
  }
  public T99_SRC_PAY_CHANNEL_RELA_HIS with_Src_payment_channel_Cd(String Src_payment_channel_Cd) {
    this.Src_payment_channel_Cd = Src_payment_channel_Cd;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public T99_SRC_PAY_CHANNEL_RELA_HIS with_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
    return this;
  }
  private java.sql.Date Effect_Dt;
  public java.sql.Date get_Effect_Dt() {
    return Effect_Dt;
  }
  public void set_Effect_Dt(java.sql.Date Effect_Dt) {
    this.Effect_Dt = Effect_Dt;
  }
  public T99_SRC_PAY_CHANNEL_RELA_HIS with_Effect_Dt(java.sql.Date Effect_Dt) {
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
  public T99_SRC_PAY_CHANNEL_RELA_HIS with_Invalid_Dt(java.sql.Date Invalid_Dt) {
    this.Invalid_Dt = Invalid_Dt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_SRC_PAY_CHANNEL_RELA_HIS)) {
      return false;
    }
    T99_SRC_PAY_CHANNEL_RELA_HIS that = (T99_SRC_PAY_CHANNEL_RELA_HIS) o;
    boolean equal = true;
    equal = equal && (this.payment_channel_Cd == null ? that.payment_channel_Cd == null : this.payment_channel_Cd.equals(that.payment_channel_Cd));
    equal = equal && (this.Src_payment_channel_Cd == null ? that.Src_payment_channel_Cd == null : this.Src_payment_channel_Cd.equals(that.Src_payment_channel_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.Effect_Dt == null ? that.Effect_Dt == null : this.Effect_Dt.equals(that.Effect_Dt));
    equal = equal && (this.Invalid_Dt == null ? that.Invalid_Dt == null : this.Invalid_Dt.equals(that.Invalid_Dt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_SRC_PAY_CHANNEL_RELA_HIS)) {
      return false;
    }
    T99_SRC_PAY_CHANNEL_RELA_HIS that = (T99_SRC_PAY_CHANNEL_RELA_HIS) o;
    boolean equal = true;
    equal = equal && (this.payment_channel_Cd == null ? that.payment_channel_Cd == null : this.payment_channel_Cd.equals(that.payment_channel_Cd));
    equal = equal && (this.Src_payment_channel_Cd == null ? that.Src_payment_channel_Cd == null : this.Src_payment_channel_Cd.equals(that.Src_payment_channel_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.Effect_Dt == null ? that.Effect_Dt == null : this.Effect_Dt.equals(that.Effect_Dt));
    equal = equal && (this.Invalid_Dt == null ? that.Invalid_Dt == null : this.Invalid_Dt.equals(that.Invalid_Dt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.payment_channel_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Src_payment_channel_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Effect_Dt = JdbcWritableBridge.readDate(4, __dbResults);
    this.Invalid_Dt = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.payment_channel_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Src_payment_channel_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Effect_Dt = JdbcWritableBridge.readDate(4, __dbResults);
    this.Invalid_Dt = JdbcWritableBridge.readDate(5, __dbResults);
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
    JdbcWritableBridge.writeString(Src_payment_channel_Cd, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Effect_Dt, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Invalid_Dt, 5 + __off, 91, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(payment_channel_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Src_payment_channel_Cd, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Effect_Dt, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Invalid_Dt, 5 + __off, 91, __dbStmt);
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
        this.Src_payment_channel_Cd = null;
    } else {
    this.Src_payment_channel_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Source_Sys_Cd = null;
    } else {
    this.Source_Sys_Cd = Text.readString(__dataIn);
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
    if (null == this.Src_payment_channel_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_payment_channel_Cd);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
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
    if (null == this.Src_payment_channel_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_payment_channel_Cd);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Src_payment_channel_Cd==null?"\\N":Src_payment_channel_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Src_payment_channel_Cd==null?"\\N":Src_payment_channel_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
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
    if (__cur_str.equals("null")) { this.Src_payment_channel_Cd = null; } else {
      this.Src_payment_channel_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Src_payment_channel_Cd = null; } else {
      this.Src_payment_channel_Cd = __cur_str;
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
    T99_SRC_PAY_CHANNEL_RELA_HIS o = (T99_SRC_PAY_CHANNEL_RELA_HIS) super.clone();
    o.Effect_Dt = (o.Effect_Dt != null) ? (java.sql.Date) o.Effect_Dt.clone() : null;
    o.Invalid_Dt = (o.Invalid_Dt != null) ? (java.sql.Date) o.Invalid_Dt.clone() : null;
    return o;
  }

  public void clone0(T99_SRC_PAY_CHANNEL_RELA_HIS o) throws CloneNotSupportedException {
    o.Effect_Dt = (o.Effect_Dt != null) ? (java.sql.Date) o.Effect_Dt.clone() : null;
    o.Invalid_Dt = (o.Invalid_Dt != null) ? (java.sql.Date) o.Invalid_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("payment_channel_Cd", this.payment_channel_Cd);
    __sqoop$field_map.put("Src_payment_channel_Cd", this.Src_payment_channel_Cd);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("Effect_Dt", this.Effect_Dt);
    __sqoop$field_map.put("Invalid_Dt", this.Invalid_Dt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("payment_channel_Cd", this.payment_channel_Cd);
    __sqoop$field_map.put("Src_payment_channel_Cd", this.Src_payment_channel_Cd);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
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
