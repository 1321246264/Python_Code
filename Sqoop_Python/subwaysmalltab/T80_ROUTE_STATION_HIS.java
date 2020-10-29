// ORM class for table 'T80_ROUTE_STATION_HIS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Jun 28 12:40:40 CST 2020
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

public class T80_ROUTE_STATION_HIS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Route_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Route_ID = (String)value;
      }
    });
    setters.put("Station_Sn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Station_Sn = (Integer)value;
      }
    });
    setters.put("Start_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Start_Tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Station_ID = (String)value;
      }
    });
    setters.put("Src_Station_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Src_Station_Cd = (String)value;
      }
    });
    setters.put("Trip_Drct_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Trip_Drct_Cd = (String)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("End_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T80_ROUTE_STATION_HIS.this.End_Tm = (java.sql.Timestamp)value;
      }
    });
  }
  public T80_ROUTE_STATION_HIS() {
    init0();
  }
  private String Route_ID;
  public String get_Route_ID() {
    return Route_ID;
  }
  public void set_Route_ID(String Route_ID) {
    this.Route_ID = Route_ID;
  }
  public T80_ROUTE_STATION_HIS with_Route_ID(String Route_ID) {
    this.Route_ID = Route_ID;
    return this;
  }
  private Integer Station_Sn;
  public Integer get_Station_Sn() {
    return Station_Sn;
  }
  public void set_Station_Sn(Integer Station_Sn) {
    this.Station_Sn = Station_Sn;
  }
  public T80_ROUTE_STATION_HIS with_Station_Sn(Integer Station_Sn) {
    this.Station_Sn = Station_Sn;
    return this;
  }
  private java.sql.Timestamp Start_Tm;
  public java.sql.Timestamp get_Start_Tm() {
    return Start_Tm;
  }
  public void set_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
  }
  public T80_ROUTE_STATION_HIS with_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
    return this;
  }
  private String Station_ID;
  public String get_Station_ID() {
    return Station_ID;
  }
  public void set_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
  }
  public T80_ROUTE_STATION_HIS with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private String Src_Station_Cd;
  public String get_Src_Station_Cd() {
    return Src_Station_Cd;
  }
  public void set_Src_Station_Cd(String Src_Station_Cd) {
    this.Src_Station_Cd = Src_Station_Cd;
  }
  public T80_ROUTE_STATION_HIS with_Src_Station_Cd(String Src_Station_Cd) {
    this.Src_Station_Cd = Src_Station_Cd;
    return this;
  }
  private String Trip_Drct_Cd;
  public String get_Trip_Drct_Cd() {
    return Trip_Drct_Cd;
  }
  public void set_Trip_Drct_Cd(String Trip_Drct_Cd) {
    this.Trip_Drct_Cd = Trip_Drct_Cd;
  }
  public T80_ROUTE_STATION_HIS with_Trip_Drct_Cd(String Trip_Drct_Cd) {
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
  public T80_ROUTE_STATION_HIS with_Source_Sys_Cd(String Source_Sys_Cd) {
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
  public T80_ROUTE_STATION_HIS with_End_Tm(java.sql.Timestamp End_Tm) {
    this.End_Tm = End_Tm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T80_ROUTE_STATION_HIS)) {
      return false;
    }
    T80_ROUTE_STATION_HIS that = (T80_ROUTE_STATION_HIS) o;
    boolean equal = true;
    equal = equal && (this.Route_ID == null ? that.Route_ID == null : this.Route_ID.equals(that.Route_ID));
    equal = equal && (this.Station_Sn == null ? that.Station_Sn == null : this.Station_Sn.equals(that.Station_Sn));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Src_Station_Cd == null ? that.Src_Station_Cd == null : this.Src_Station_Cd.equals(that.Src_Station_Cd));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T80_ROUTE_STATION_HIS)) {
      return false;
    }
    T80_ROUTE_STATION_HIS that = (T80_ROUTE_STATION_HIS) o;
    boolean equal = true;
    equal = equal && (this.Route_ID == null ? that.Route_ID == null : this.Route_ID.equals(that.Route_ID));
    equal = equal && (this.Station_Sn == null ? that.Station_Sn == null : this.Station_Sn.equals(that.Station_Sn));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Src_Station_Cd == null ? that.Src_Station_Cd == null : this.Src_Station_Cd.equals(that.Src_Station_Cd));
    equal = equal && (this.Trip_Drct_Cd == null ? that.Trip_Drct_Cd == null : this.Trip_Drct_Cd.equals(that.Trip_Drct_Cd));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Route_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Station_Sn = JdbcWritableBridge.readInteger(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.Src_Station_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Route_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Station_Sn = JdbcWritableBridge.readInteger(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.Src_Station_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Trip_Drct_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(7, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeString(Route_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Station_Sn, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Src_Station_Cd, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Route_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Station_Sn, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Src_Station_Cd, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Trip_Drct_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 7 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 8 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Route_ID = null;
    } else {
    this.Route_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Sn = null;
    } else {
    this.Station_Sn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Tm = null;
    } else {
    this.Start_Tm = new Timestamp(__dataIn.readLong());
    this.Start_Tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Station_ID = null;
    } else {
    this.Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Src_Station_Cd = null;
    } else {
    this.Src_Station_Cd = Text.readString(__dataIn);
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
    if (null == this.Route_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Route_ID);
    }
    if (null == this.Station_Sn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Station_Sn);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Src_Station_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_Station_Cd);
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
    if (null == this.Route_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Route_ID);
    }
    if (null == this.Station_Sn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Station_Sn);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Src_Station_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_Station_Cd);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Route_ID==null?"\\N":Route_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Sn==null?"\\N":"" + Station_Sn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Src_Station_Cd==null?"\\N":Src_Station_Cd, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Route_ID==null?"\\N":Route_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Sn==null?"\\N":"" + Station_Sn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Src_Station_Cd==null?"\\N":Src_Station_Cd, delimiters));
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
    if (__cur_str.equals("null")) { this.Route_ID = null; } else {
      this.Route_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Sn = null; } else {
      this.Station_Sn = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Src_Station_Cd = null; } else {
      this.Src_Station_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Route_ID = null; } else {
      this.Route_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Sn = null; } else {
      this.Station_Sn = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Src_Station_Cd = null; } else {
      this.Src_Station_Cd = __cur_str;
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
    T80_ROUTE_STATION_HIS o = (T80_ROUTE_STATION_HIS) super.clone();
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
    return o;
  }

  public void clone0(T80_ROUTE_STATION_HIS o) throws CloneNotSupportedException {
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Route_ID", this.Route_ID);
    __sqoop$field_map.put("Station_Sn", this.Station_Sn);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Src_Station_Cd", this.Src_Station_Cd);
    __sqoop$field_map.put("Trip_Drct_Cd", this.Trip_Drct_Cd);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Route_ID", this.Route_ID);
    __sqoop$field_map.put("Station_Sn", this.Station_Sn);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Src_Station_Cd", this.Src_Station_Cd);
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
