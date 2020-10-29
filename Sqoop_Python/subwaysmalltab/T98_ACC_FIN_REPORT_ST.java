// ORM class for table 'T98_ACC_FIN_REPORT_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:44:52 CST 2020
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

public class T98_ACC_FIN_REPORT_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("STAT_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ACC_FIN_REPORT_ST.this.STAT_DT = (java.sql.Date)value;
      }
    });
    setters.put("Line_Merge_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ACC_FIN_REPORT_ST.this.Line_Merge_Ind = (Integer)value;
      }
    });
    setters.put("LINE_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ACC_FIN_REPORT_ST.this.LINE_ID = (String)value;
      }
    });
    setters.put("INDEX_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ACC_FIN_REPORT_ST.this.INDEX_ID = (String)value;
      }
    });
    setters.put("INDEX_VALUE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_ACC_FIN_REPORT_ST.this.INDEX_VALUE = (java.math.BigDecimal)value;
      }
    });
  }
  public T98_ACC_FIN_REPORT_ST() {
    init0();
  }
  private java.sql.Date STAT_DT;
  public java.sql.Date get_STAT_DT() {
    return STAT_DT;
  }
  public void set_STAT_DT(java.sql.Date STAT_DT) {
    this.STAT_DT = STAT_DT;
  }
  public T98_ACC_FIN_REPORT_ST with_STAT_DT(java.sql.Date STAT_DT) {
    this.STAT_DT = STAT_DT;
    return this;
  }
  private Integer Line_Merge_Ind;
  public Integer get_Line_Merge_Ind() {
    return Line_Merge_Ind;
  }
  public void set_Line_Merge_Ind(Integer Line_Merge_Ind) {
    this.Line_Merge_Ind = Line_Merge_Ind;
  }
  public T98_ACC_FIN_REPORT_ST with_Line_Merge_Ind(Integer Line_Merge_Ind) {
    this.Line_Merge_Ind = Line_Merge_Ind;
    return this;
  }
  private String LINE_ID;
  public String get_LINE_ID() {
    return LINE_ID;
  }
  public void set_LINE_ID(String LINE_ID) {
    this.LINE_ID = LINE_ID;
  }
  public T98_ACC_FIN_REPORT_ST with_LINE_ID(String LINE_ID) {
    this.LINE_ID = LINE_ID;
    return this;
  }
  private String INDEX_ID;
  public String get_INDEX_ID() {
    return INDEX_ID;
  }
  public void set_INDEX_ID(String INDEX_ID) {
    this.INDEX_ID = INDEX_ID;
  }
  public T98_ACC_FIN_REPORT_ST with_INDEX_ID(String INDEX_ID) {
    this.INDEX_ID = INDEX_ID;
    return this;
  }
  private java.math.BigDecimal INDEX_VALUE;
  public java.math.BigDecimal get_INDEX_VALUE() {
    return INDEX_VALUE;
  }
  public void set_INDEX_VALUE(java.math.BigDecimal INDEX_VALUE) {
    this.INDEX_VALUE = INDEX_VALUE;
  }
  public T98_ACC_FIN_REPORT_ST with_INDEX_VALUE(java.math.BigDecimal INDEX_VALUE) {
    this.INDEX_VALUE = INDEX_VALUE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_ACC_FIN_REPORT_ST)) {
      return false;
    }
    T98_ACC_FIN_REPORT_ST that = (T98_ACC_FIN_REPORT_ST) o;
    boolean equal = true;
    equal = equal && (this.STAT_DT == null ? that.STAT_DT == null : this.STAT_DT.equals(that.STAT_DT));
    equal = equal && (this.Line_Merge_Ind == null ? that.Line_Merge_Ind == null : this.Line_Merge_Ind.equals(that.Line_Merge_Ind));
    equal = equal && (this.LINE_ID == null ? that.LINE_ID == null : this.LINE_ID.equals(that.LINE_ID));
    equal = equal && (this.INDEX_ID == null ? that.INDEX_ID == null : this.INDEX_ID.equals(that.INDEX_ID));
    equal = equal && (this.INDEX_VALUE == null ? that.INDEX_VALUE == null : this.INDEX_VALUE.equals(that.INDEX_VALUE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_ACC_FIN_REPORT_ST)) {
      return false;
    }
    T98_ACC_FIN_REPORT_ST that = (T98_ACC_FIN_REPORT_ST) o;
    boolean equal = true;
    equal = equal && (this.STAT_DT == null ? that.STAT_DT == null : this.STAT_DT.equals(that.STAT_DT));
    equal = equal && (this.Line_Merge_Ind == null ? that.Line_Merge_Ind == null : this.Line_Merge_Ind.equals(that.Line_Merge_Ind));
    equal = equal && (this.LINE_ID == null ? that.LINE_ID == null : this.LINE_ID.equals(that.LINE_ID));
    equal = equal && (this.INDEX_ID == null ? that.INDEX_ID == null : this.INDEX_ID.equals(that.INDEX_ID));
    equal = equal && (this.INDEX_VALUE == null ? that.INDEX_VALUE == null : this.INDEX_VALUE.equals(that.INDEX_VALUE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STAT_DT = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_Merge_Ind = JdbcWritableBridge.readInteger(2, __dbResults);
    this.LINE_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.INDEX_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.INDEX_VALUE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STAT_DT = JdbcWritableBridge.readDate(1, __dbResults);
    this.Line_Merge_Ind = JdbcWritableBridge.readInteger(2, __dbResults);
    this.LINE_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.INDEX_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.INDEX_VALUE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
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
    JdbcWritableBridge.writeDate(STAT_DT, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Line_Merge_Ind, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(LINE_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDEX_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INDEX_VALUE, 5 + __off, 3, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(STAT_DT, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Line_Merge_Ind, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(LINE_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDEX_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INDEX_VALUE, 5 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.STAT_DT = null;
    } else {
    this.STAT_DT = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Line_Merge_Ind = null;
    } else {
    this.Line_Merge_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LINE_ID = null;
    } else {
    this.LINE_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INDEX_ID = null;
    } else {
    this.INDEX_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INDEX_VALUE = null;
    } else {
    this.INDEX_VALUE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STAT_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STAT_DT.getTime());
    }
    if (null == this.Line_Merge_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Line_Merge_Ind);
    }
    if (null == this.LINE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_ID);
    }
    if (null == this.INDEX_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDEX_ID);
    }
    if (null == this.INDEX_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INDEX_VALUE, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.STAT_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STAT_DT.getTime());
    }
    if (null == this.Line_Merge_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Line_Merge_Ind);
    }
    if (null == this.LINE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_ID);
    }
    if (null == this.INDEX_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDEX_ID);
    }
    if (null == this.INDEX_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.INDEX_VALUE, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(STAT_DT==null?"\\N":"" + STAT_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Merge_Ind==null?"\\N":"" + Line_Merge_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ID==null?"\\N":LINE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDEX_ID==null?"\\N":INDEX_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDEX_VALUE==null?"\\N":INDEX_VALUE.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STAT_DT==null?"\\N":"" + STAT_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Merge_Ind==null?"\\N":"" + Line_Merge_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ID==null?"\\N":LINE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDEX_ID==null?"\\N":INDEX_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDEX_VALUE==null?"\\N":INDEX_VALUE.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STAT_DT = null; } else {
      this.STAT_DT = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.LINE_ID = null; } else {
      this.LINE_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.INDEX_ID = null; } else {
      this.INDEX_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INDEX_VALUE = null; } else {
      this.INDEX_VALUE = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STAT_DT = null; } else {
      this.STAT_DT = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.LINE_ID = null; } else {
      this.LINE_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.INDEX_ID = null; } else {
      this.INDEX_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INDEX_VALUE = null; } else {
      this.INDEX_VALUE = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_ACC_FIN_REPORT_ST o = (T98_ACC_FIN_REPORT_ST) super.clone();
    o.STAT_DT = (o.STAT_DT != null) ? (java.sql.Date) o.STAT_DT.clone() : null;
    return o;
  }

  public void clone0(T98_ACC_FIN_REPORT_ST o) throws CloneNotSupportedException {
    o.STAT_DT = (o.STAT_DT != null) ? (java.sql.Date) o.STAT_DT.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("STAT_DT", this.STAT_DT);
    __sqoop$field_map.put("Line_Merge_Ind", this.Line_Merge_Ind);
    __sqoop$field_map.put("LINE_ID", this.LINE_ID);
    __sqoop$field_map.put("INDEX_ID", this.INDEX_ID);
    __sqoop$field_map.put("INDEX_VALUE", this.INDEX_VALUE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STAT_DT", this.STAT_DT);
    __sqoop$field_map.put("Line_Merge_Ind", this.Line_Merge_Ind);
    __sqoop$field_map.put("LINE_ID", this.LINE_ID);
    __sqoop$field_map.put("INDEX_ID", this.INDEX_ID);
    __sqoop$field_map.put("INDEX_VALUE", this.INDEX_VALUE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
