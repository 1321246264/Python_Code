// ORM class for table 'T98_AREA_OD_PASGR_DATE_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:48:19 CST 2020
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

public class T98_AREA_OD_PASGR_DATE_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("stat_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.stat_dt = (java.sql.Date)value;
      }
    });
    setters.put("prod_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.prod_id = (String)value;
      }
    });
    setters.put("OD_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.OD_type = (String)value;
      }
    });
    setters.put("area_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.area_type = (String)value;
      }
    });
    setters.put("Entry_Quatity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.Entry_Quatity = (java.math.BigDecimal)value;
      }
    });
    setters.put("pasgr_Quatity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_AREA_OD_PASGR_DATE_ST.this.pasgr_Quatity = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_AREA_OD_PASGR_DATE_ST() {
    init0();
  }
  private java.sql.Date stat_dt;
  public java.sql.Date get_stat_dt() {
    return stat_dt;
  }
  public void set_stat_dt(java.sql.Date stat_dt) {
    this.stat_dt = stat_dt;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_stat_dt(java.sql.Date stat_dt) {
    this.stat_dt = stat_dt;
    return this;
  }
  private String prod_id;
  public String get_prod_id() {
    return prod_id;
  }
  public void set_prod_id(String prod_id) {
    this.prod_id = prod_id;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_prod_id(String prod_id) {
    this.prod_id = prod_id;
    return this;
  }
  private String OD_type;
  public String get_OD_type() {
    return OD_type;
  }
  public void set_OD_type(String OD_type) {
    this.OD_type = OD_type;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_OD_type(String OD_type) {
    this.OD_type = OD_type;
    return this;
  }
  private String area_type;
  public String get_area_type() {
    return area_type;
  }
  public void set_area_type(String area_type) {
    this.area_type = area_type;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_area_type(String area_type) {
    this.area_type = area_type;
    return this;
  }
  private java.math.BigDecimal Entry_Quatity;
  public java.math.BigDecimal get_Entry_Quatity() {
    return Entry_Quatity;
  }
  public void set_Entry_Quatity(java.math.BigDecimal Entry_Quatity) {
    this.Entry_Quatity = Entry_Quatity;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_Entry_Quatity(java.math.BigDecimal Entry_Quatity) {
    this.Entry_Quatity = Entry_Quatity;
    return this;
  }
  private java.math.BigDecimal pasgr_Quatity;
  public java.math.BigDecimal get_pasgr_Quatity() {
    return pasgr_Quatity;
  }
  public void set_pasgr_Quatity(java.math.BigDecimal pasgr_Quatity) {
    this.pasgr_Quatity = pasgr_Quatity;
  }
  public T98_AREA_OD_PASGR_DATE_ST with_pasgr_Quatity(java.math.BigDecimal pasgr_Quatity) {
    this.pasgr_Quatity = pasgr_Quatity;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_AREA_OD_PASGR_DATE_ST)) {
      return false;
    }
    T98_AREA_OD_PASGR_DATE_ST that = (T98_AREA_OD_PASGR_DATE_ST) o;
    boolean equal = true;
    equal = equal && (this.stat_dt == null ? that.stat_dt == null : this.stat_dt.equals(that.stat_dt));
    equal = equal && (this.prod_id == null ? that.prod_id == null : this.prod_id.equals(that.prod_id));
    equal = equal && (this.OD_type == null ? that.OD_type == null : this.OD_type.equals(that.OD_type));
    equal = equal && (this.area_type == null ? that.area_type == null : this.area_type.equals(that.area_type));
    equal = equal && (this.Entry_Quatity == null ? that.Entry_Quatity == null : this.Entry_Quatity.equals(that.Entry_Quatity));
    equal = equal && (this.pasgr_Quatity == null ? that.pasgr_Quatity == null : this.pasgr_Quatity.equals(that.pasgr_Quatity));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_AREA_OD_PASGR_DATE_ST)) {
      return false;
    }
    T98_AREA_OD_PASGR_DATE_ST that = (T98_AREA_OD_PASGR_DATE_ST) o;
    boolean equal = true;
    equal = equal && (this.stat_dt == null ? that.stat_dt == null : this.stat_dt.equals(that.stat_dt));
    equal = equal && (this.prod_id == null ? that.prod_id == null : this.prod_id.equals(that.prod_id));
    equal = equal && (this.OD_type == null ? that.OD_type == null : this.OD_type.equals(that.OD_type));
    equal = equal && (this.area_type == null ? that.area_type == null : this.area_type.equals(that.area_type));
    equal = equal && (this.Entry_Quatity == null ? that.Entry_Quatity == null : this.Entry_Quatity.equals(that.Entry_Quatity));
    equal = equal && (this.pasgr_Quatity == null ? that.pasgr_Quatity == null : this.pasgr_Quatity.equals(that.pasgr_Quatity));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stat_dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.prod_id = JdbcWritableBridge.readString(2, __dbResults);
    this.OD_type = JdbcWritableBridge.readString(3, __dbResults);
    this.area_type = JdbcWritableBridge.readString(4, __dbResults);
    this.Entry_Quatity = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.pasgr_Quatity = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stat_dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.prod_id = JdbcWritableBridge.readString(2, __dbResults);
    this.OD_type = JdbcWritableBridge.readString(3, __dbResults);
    this.area_type = JdbcWritableBridge.readString(4, __dbResults);
    this.Entry_Quatity = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.pasgr_Quatity = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeDate(stat_dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(prod_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Entry_Quatity, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pasgr_Quatity, 6 + __off, 3, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(stat_dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(prod_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OD_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Entry_Quatity, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pasgr_Quatity, 6 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stat_dt = null;
    } else {
    this.stat_dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.prod_id = null;
    } else {
    this.prod_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OD_type = null;
    } else {
    this.OD_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area_type = null;
    } else {
    this.area_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Entry_Quatity = null;
    } else {
    this.Entry_Quatity = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pasgr_Quatity = null;
    } else {
    this.pasgr_Quatity = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stat_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stat_dt.getTime());
    }
    if (null == this.prod_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_id);
    }
    if (null == this.OD_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_type);
    }
    if (null == this.area_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_type);
    }
    if (null == this.Entry_Quatity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Entry_Quatity, __dataOut);
    }
    if (null == this.pasgr_Quatity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pasgr_Quatity, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stat_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stat_dt.getTime());
    }
    if (null == this.prod_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_id);
    }
    if (null == this.OD_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OD_type);
    }
    if (null == this.area_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_type);
    }
    if (null == this.Entry_Quatity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Entry_Quatity, __dataOut);
    }
    if (null == this.pasgr_Quatity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pasgr_Quatity, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(stat_dt==null?"\\N":"" + stat_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_id==null?"\\N":prod_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_type==null?"\\N":OD_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_type==null?"\\N":area_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Entry_Quatity==null?"\\N":Entry_Quatity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pasgr_Quatity==null?"\\N":pasgr_Quatity.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stat_dt==null?"\\N":"" + stat_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_id==null?"\\N":prod_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OD_type==null?"\\N":OD_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_type==null?"\\N":area_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Entry_Quatity==null?"\\N":Entry_Quatity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pasgr_Quatity==null?"\\N":pasgr_Quatity.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stat_dt = null; } else {
      this.stat_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.prod_id = null; } else {
      this.prod_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_type = null; } else {
      this.OD_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area_type = null; } else {
      this.area_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Entry_Quatity = null; } else {
      this.Entry_Quatity = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pasgr_Quatity = null; } else {
      this.pasgr_Quatity = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stat_dt = null; } else {
      this.stat_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.prod_id = null; } else {
      this.prod_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OD_type = null; } else {
      this.OD_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area_type = null; } else {
      this.area_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Entry_Quatity = null; } else {
      this.Entry_Quatity = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pasgr_Quatity = null; } else {
      this.pasgr_Quatity = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_AREA_OD_PASGR_DATE_ST o = (T98_AREA_OD_PASGR_DATE_ST) super.clone();
    o.stat_dt = (o.stat_dt != null) ? (java.sql.Date) o.stat_dt.clone() : null;
    return o;
  }

  public void clone0(T98_AREA_OD_PASGR_DATE_ST o) throws CloneNotSupportedException {
    o.stat_dt = (o.stat_dt != null) ? (java.sql.Date) o.stat_dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("stat_dt", this.stat_dt);
    __sqoop$field_map.put("prod_id", this.prod_id);
    __sqoop$field_map.put("OD_type", this.OD_type);
    __sqoop$field_map.put("area_type", this.area_type);
    __sqoop$field_map.put("Entry_Quatity", this.Entry_Quatity);
    __sqoop$field_map.put("pasgr_Quatity", this.pasgr_Quatity);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stat_dt", this.stat_dt);
    __sqoop$field_map.put("prod_id", this.prod_id);
    __sqoop$field_map.put("OD_type", this.OD_type);
    __sqoop$field_map.put("area_type", this.area_type);
    __sqoop$field_map.put("Entry_Quatity", this.Entry_Quatity);
    __sqoop$field_map.put("pasgr_Quatity", this.pasgr_Quatity);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
