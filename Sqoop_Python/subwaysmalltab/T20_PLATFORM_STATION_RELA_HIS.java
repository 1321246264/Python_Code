// ORM class for table 'T20_PLATFORM_STATION_RELA_HIS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 03 09:45:27 CST 2020
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

public class T20_PLATFORM_STATION_RELA_HIS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Platf_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.Platf_ID = (String)value;
      }
    });
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.Station_ID = (String)value;
      }
    });
    setters.put("Start_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.Start_Tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("End_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_PLATFORM_STATION_RELA_HIS.this.End_Tm = (java.sql.Timestamp)value;
      }
    });
  }
  public T20_PLATFORM_STATION_RELA_HIS() {
    init0();
  }
  private String Platf_ID;
  public String get_Platf_ID() {
    return Platf_ID;
  }
  public void set_Platf_ID(String Platf_ID) {
    this.Platf_ID = Platf_ID;
  }
  public T20_PLATFORM_STATION_RELA_HIS with_Platf_ID(String Platf_ID) {
    this.Platf_ID = Platf_ID;
    return this;
  }
  private String Station_ID;
  public String get_Station_ID() {
    return Station_ID;
  }
  public void set_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
  }
  public T20_PLATFORM_STATION_RELA_HIS with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private java.sql.Timestamp Start_Tm;
  public java.sql.Timestamp get_Start_Tm() {
    return Start_Tm;
  }
  public void set_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
  }
  public T20_PLATFORM_STATION_RELA_HIS with_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
    return this;
  }
  private String Trip_Drct_Cd;
  public String get_Trip_Drct_Cd() {
    return Trip_Drct_Cd;
  }
  public void set_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
  }
  public T20_PLATFORM_STATION_RELA_HIS with_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public T20_PLATFORM_STATION_RELA_HIS with_Source_Sys_Cd(String Source_Sys_Cd) {
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
  public T20_PLATFORM_STATION_RELA_HIS with_End_Tm(java.sql.Timestamp End_Tm) {
    this.End_Tm = End_Tm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_PLATFORM_STATION_RELA_HIS)) {
      return false;
    }
    T20_PLATFORM_STATION_RELA_HIS that = (T20_PLATFORM_STATION_RELA_HIS) o;
    boolean equal = true;
    equal = equal && (this.Platf_ID == null ? that.Platf_ID == null : this.Platf_ID.equals(that.Platf_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_PLATFORM_STATION_RELA_HIS)) {
      return false;
    }
    T20_PLATFORM_STATION_RELA_HIS that = (T20_PLATFORM_STATION_RELA_HIS) o;
    boolean equal = true;
    equal = equal && (this.Platf_ID == null ? that.Platf_ID == null : this.Platf_ID.equals(that.Platf_ID));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Platf_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Platf_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(6, __dbResults);
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
    JdbcWritableBridge.writeString(Platf_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Platf_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 6 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Platf_ID = null;
    } else {
    this.Platf_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_ID = null;
    } else {
    this.Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Tm = null;
    } else {
    this.Start_Tm = new Timestamp(__dataIn.readLong());
    this.Start_Tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Trip_Drct_Cd = null;
    } else {
    this.Trip_Drct_Cd = Text.readString(__dataIn);
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
    if (null == this.Platf_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Platf_ID);
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
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
    if (null == this.Platf_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Platf_ID);
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Trip_Drct_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Trip_Drct_Cd);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Platf_ID==null?"\\N":Platf_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Platf_ID==null?"\\N":Platf_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Trip_Drct_Cd==null?"\\N":Trip_Drct_Cd, delimiters));
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
    if (__cur_str.equals("null")) { this.Platf_ID = null; } else {
      this.Platf_ID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Trip_Drct_Cd = null; } else {
      this.Trip_Drct_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Platf_ID = null; } else {
      this.Platf_ID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Trip_Drct_Cd = null; } else {
      this.Trip_Drct_Cd = __cur_str;
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
    T20_PLATFORM_STATION_RELA_HIS o = (T20_PLATFORM_STATION_RELA_HIS) super.clone();
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
    return o;
  }

  public void clone0(T20_PLATFORM_STATION_RELA_HIS o) throws CloneNotSupportedException {
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Platf_ID", this.Platf_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Platf_ID", this.Platf_ID);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
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
