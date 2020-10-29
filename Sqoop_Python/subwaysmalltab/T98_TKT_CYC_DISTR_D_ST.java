// ORM class for table 'T98_TKT_CYC_DISTR_D_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:54:54 CST 2020
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

public class T98_TKT_CYC_DISTR_D_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_CYC_DISTR_D_ST.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Net_Stat_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_CYC_DISTR_D_ST.this.Net_Stat_Type_Cd = (String)value;
      }
    });
    setters.put("Using_Cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_CYC_DISTR_D_ST.this.Using_Cnt = (Integer)value;
      }
    });
    setters.put("Card_Qtty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_TKT_CYC_DISTR_D_ST.this.Card_Qtty = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_TKT_CYC_DISTR_D_ST() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T98_TKT_CYC_DISTR_D_ST with_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
    return this;
  }
  private String Net_Stat_Type_Cd;
  public String get_Net_Stat_Type_Cd() {
    return Net_Stat_Type_Cd;
  }
  public void set_Net_Stat_Type_Cd(String Net_Stat_Type_Cd) {
    this.Net_Stat_Type_Cd = Net_Stat_Type_Cd;
  }
  public T98_TKT_CYC_DISTR_D_ST with_Net_Stat_Type_Cd(String Net_Stat_Type_Cd) {
    this.Net_Stat_Type_Cd = Net_Stat_Type_Cd;
    return this;
  }
  private Integer Using_Cnt;
  public Integer get_Using_Cnt() {
    return Using_Cnt;
  }
  public void set_Using_Cnt(Integer Using_Cnt) {
    this.Using_Cnt = Using_Cnt;
  }
  public T98_TKT_CYC_DISTR_D_ST with_Using_Cnt(Integer Using_Cnt) {
    this.Using_Cnt = Using_Cnt;
    return this;
  }
  private java.math.BigDecimal Card_Qtty;
  public java.math.BigDecimal get_Card_Qtty() {
    return Card_Qtty;
  }
  public void set_Card_Qtty(java.math.BigDecimal Card_Qtty) {
    this.Card_Qtty = Card_Qtty;
  }
  public T98_TKT_CYC_DISTR_D_ST with_Card_Qtty(java.math.BigDecimal Card_Qtty) {
    this.Card_Qtty = Card_Qtty;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_CYC_DISTR_D_ST)) {
      return false;
    }
    T98_TKT_CYC_DISTR_D_ST that = (T98_TKT_CYC_DISTR_D_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Net_Stat_Type_Cd == null ? that.Net_Stat_Type_Cd == null : this.Net_Stat_Type_Cd.equals(that.Net_Stat_Type_Cd));
    equal = equal && (this.Using_Cnt == null ? that.Using_Cnt == null : this.Using_Cnt.equals(that.Using_Cnt));
    equal = equal && (this.Card_Qtty == null ? that.Card_Qtty == null : this.Card_Qtty.equals(that.Card_Qtty));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_TKT_CYC_DISTR_D_ST)) {
      return false;
    }
    T98_TKT_CYC_DISTR_D_ST that = (T98_TKT_CYC_DISTR_D_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Net_Stat_Type_Cd == null ? that.Net_Stat_Type_Cd == null : this.Net_Stat_Type_Cd.equals(that.Net_Stat_Type_Cd));
    equal = equal && (this.Using_Cnt == null ? that.Using_Cnt == null : this.Using_Cnt.equals(that.Using_Cnt));
    equal = equal && (this.Card_Qtty == null ? that.Card_Qtty == null : this.Card_Qtty.equals(that.Card_Qtty));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Net_Stat_Type_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Using_Cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Card_Qtty = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Net_Stat_Type_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Using_Cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Card_Qtty = JdbcWritableBridge.readBigDecimal(4, __dbResults);
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
    JdbcWritableBridge.writeString(Net_Stat_Type_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Using_Cnt, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Card_Qtty, 4 + __off, 3, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Net_Stat_Type_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Using_Cnt, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Card_Qtty, 4 + __off, 3, __dbStmt);
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
        this.Net_Stat_Type_Cd = null;
    } else {
    this.Net_Stat_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Using_Cnt = null;
    } else {
    this.Using_Cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Card_Qtty = null;
    } else {
    this.Card_Qtty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Net_Stat_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Net_Stat_Type_Cd);
    }
    if (null == this.Using_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Using_Cnt);
    }
    if (null == this.Card_Qtty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Card_Qtty, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Net_Stat_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Net_Stat_Type_Cd);
    }
    if (null == this.Using_Cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Using_Cnt);
    }
    if (null == this.Card_Qtty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Card_Qtty, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Net_Stat_Type_Cd==null?"\\N":Net_Stat_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Using_Cnt==null?"\\N":"" + Using_Cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Card_Qtty==null?"\\N":Card_Qtty.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Net_Stat_Type_Cd==null?"\\N":Net_Stat_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Using_Cnt==null?"\\N":"" + Using_Cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Card_Qtty==null?"\\N":Card_Qtty.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.Net_Stat_Type_Cd = null; } else {
      this.Net_Stat_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Using_Cnt = null; } else {
      this.Using_Cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Card_Qtty = null; } else {
      this.Card_Qtty = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.Net_Stat_Type_Cd = null; } else {
      this.Net_Stat_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Using_Cnt = null; } else {
      this.Using_Cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Card_Qtty = null; } else {
      this.Card_Qtty = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_TKT_CYC_DISTR_D_ST o = (T98_TKT_CYC_DISTR_D_ST) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    return o;
  }

  public void clone0(T98_TKT_CYC_DISTR_D_ST o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Net_Stat_Type_Cd", this.Net_Stat_Type_Cd);
    __sqoop$field_map.put("Using_Cnt", this.Using_Cnt);
    __sqoop$field_map.put("Card_Qtty", this.Card_Qtty);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Net_Stat_Type_Cd", this.Net_Stat_Type_Cd);
    __sqoop$field_map.put("Using_Cnt", this.Using_Cnt);
    __sqoop$field_map.put("Card_Qtty", this.Card_Qtty);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
