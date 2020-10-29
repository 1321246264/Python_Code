// ORM class for table 'T99_STAT_DEVICE_TYPE_CD'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 02 17:12:21 CST 2020
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

public class T99_STAT_DEVICE_TYPE_CD extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Device_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Device_Type_Cd = (String)value;
      }
    });
    setters.put("Device_Type_Name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Device_Type_Name = (String)value;
      }
    });
    setters.put("Parent_Device_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Parent_Device_Type_Cd = (String)value;
      }
    });
    setters.put("Device_Type_Desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Device_Type_Desc = (String)value;
      }
    });
    setters.put("Device_Type_Level", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Device_Type_Level = (Integer)value;
      }
    });
    setters.put("Equip_Cate_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Equip_Cate_Cd = (String)value;
      }
    });
    setters.put("Device_Spcl_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_STAT_DEVICE_TYPE_CD.this.Device_Spcl_Cd = (String)value;
      }
    });
  }
  public T99_STAT_DEVICE_TYPE_CD() {
    init0();
  }
  private String Device_Type_Cd;
  public String get_Device_Type_Cd() {
    return Device_Type_Cd;
  }
  public void set_Device_Type_Cd(String Device_Type_Cd) {
    this.Device_Type_Cd = Device_Type_Cd;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Device_Type_Cd(String Device_Type_Cd) {
    this.Device_Type_Cd = Device_Type_Cd;
    return this;
  }
  private String Device_Type_Name;
  public String get_Device_Type_Name() {
    return Device_Type_Name;
  }
  public void set_Device_Type_Name(String Device_Type_Name) {
    this.Device_Type_Name = Device_Type_Name;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Device_Type_Name(String Device_Type_Name) {
    this.Device_Type_Name = Device_Type_Name;
    return this;
  }
  private String Parent_Device_Type_Cd;
  public String get_Parent_Device_Type_Cd() {
    return Parent_Device_Type_Cd;
  }
  public void set_Parent_Device_Type_Cd(String Parent_Device_Type_Cd) {
    this.Parent_Device_Type_Cd = Parent_Device_Type_Cd;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Parent_Device_Type_Cd(String Parent_Device_Type_Cd) {
    this.Parent_Device_Type_Cd = Parent_Device_Type_Cd;
    return this;
  }
  private String Device_Type_Desc;
  public String get_Device_Type_Desc() {
    return Device_Type_Desc;
  }
  public void set_Device_Type_Desc(String Device_Type_Desc) {
    this.Device_Type_Desc = Device_Type_Desc;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Device_Type_Desc(String Device_Type_Desc) {
    this.Device_Type_Desc = Device_Type_Desc;
    return this;
  }
  private Integer Device_Type_Level;
  public Integer get_Device_Type_Level() {
    return Device_Type_Level;
  }
  public void set_Device_Type_Level(Integer Device_Type_Level) {
    this.Device_Type_Level = Device_Type_Level;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Device_Type_Level(Integer Device_Type_Level) {
    this.Device_Type_Level = Device_Type_Level;
    return this;
  }
  private String Equip_Cate_Cd;
  public String get_Equip_Cate_Cd() {
    return Equip_Cate_Cd;
  }
  public void set_Equip_Cate_Cd(String Equip_Cate_Cd) {
    this.Equip_Cate_Cd = Equip_Cate_Cd;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Equip_Cate_Cd(String Equip_Cate_Cd) {
    this.Equip_Cate_Cd = Equip_Cate_Cd;
    return this;
  }
  private String Device_Spcl_Cd;
  public String get_Device_Spcl_Cd() {
    return Device_Spcl_Cd;
  }
  public void set_Device_Spcl_Cd(String Device_Spcl_Cd) {
    this.Device_Spcl_Cd = Device_Spcl_Cd;
  }
  public T99_STAT_DEVICE_TYPE_CD with_Device_Spcl_Cd(String Device_Spcl_Cd) {
    this.Device_Spcl_Cd = Device_Spcl_Cd;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_STAT_DEVICE_TYPE_CD)) {
      return false;
    }
    T99_STAT_DEVICE_TYPE_CD that = (T99_STAT_DEVICE_TYPE_CD) o;
    boolean equal = true;
    equal = equal && (this.Device_Type_Cd == null ? that.Device_Type_Cd == null : this.Device_Type_Cd.equals(that.Device_Type_Cd));
    equal = equal && (this.Device_Type_Name == null ? that.Device_Type_Name == null : this.Device_Type_Name.equals(that.Device_Type_Name));
    equal = equal && (this.Parent_Device_Type_Cd == null ? that.Parent_Device_Type_Cd == null : this.Parent_Device_Type_Cd.equals(that.Parent_Device_Type_Cd));
    equal = equal && (this.Device_Type_Desc == null ? that.Device_Type_Desc == null : this.Device_Type_Desc.equals(that.Device_Type_Desc));
    equal = equal && (this.Device_Type_Level == null ? that.Device_Type_Level == null : this.Device_Type_Level.equals(that.Device_Type_Level));
    equal = equal && (this.Equip_Cate_Cd == null ? that.Equip_Cate_Cd == null : this.Equip_Cate_Cd.equals(that.Equip_Cate_Cd));
    equal = equal && (this.Device_Spcl_Cd == null ? that.Device_Spcl_Cd == null : this.Device_Spcl_Cd.equals(that.Device_Spcl_Cd));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_STAT_DEVICE_TYPE_CD)) {
      return false;
    }
    T99_STAT_DEVICE_TYPE_CD that = (T99_STAT_DEVICE_TYPE_CD) o;
    boolean equal = true;
    equal = equal && (this.Device_Type_Cd == null ? that.Device_Type_Cd == null : this.Device_Type_Cd.equals(that.Device_Type_Cd));
    equal = equal && (this.Device_Type_Name == null ? that.Device_Type_Name == null : this.Device_Type_Name.equals(that.Device_Type_Name));
    equal = equal && (this.Parent_Device_Type_Cd == null ? that.Parent_Device_Type_Cd == null : this.Parent_Device_Type_Cd.equals(that.Parent_Device_Type_Cd));
    equal = equal && (this.Device_Type_Desc == null ? that.Device_Type_Desc == null : this.Device_Type_Desc.equals(that.Device_Type_Desc));
    equal = equal && (this.Device_Type_Level == null ? that.Device_Type_Level == null : this.Device_Type_Level.equals(that.Device_Type_Level));
    equal = equal && (this.Equip_Cate_Cd == null ? that.Equip_Cate_Cd == null : this.Equip_Cate_Cd.equals(that.Equip_Cate_Cd));
    equal = equal && (this.Device_Spcl_Cd == null ? that.Device_Spcl_Cd == null : this.Device_Spcl_Cd.equals(that.Device_Spcl_Cd));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Device_Type_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Device_Type_Name = JdbcWritableBridge.readString(2, __dbResults);
    this.Parent_Device_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Device_Type_Desc = JdbcWritableBridge.readString(4, __dbResults);
    this.Device_Type_Level = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Equip_Cate_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Device_Spcl_Cd = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Device_Type_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Device_Type_Name = JdbcWritableBridge.readString(2, __dbResults);
    this.Parent_Device_Type_Cd = JdbcWritableBridge.readString(3, __dbResults);
    this.Device_Type_Desc = JdbcWritableBridge.readString(4, __dbResults);
    this.Device_Type_Level = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Equip_Cate_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Device_Spcl_Cd = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeString(Device_Type_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Type_Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Parent_Device_Type_Cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Type_Desc, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Device_Type_Level, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Equip_Cate_Cd, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Spcl_Cd, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Device_Type_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Type_Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Parent_Device_Type_Cd, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Type_Desc, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Device_Type_Level, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Equip_Cate_Cd, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Device_Spcl_Cd, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Device_Type_Cd = null;
    } else {
    this.Device_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Device_Type_Name = null;
    } else {
    this.Device_Type_Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Parent_Device_Type_Cd = null;
    } else {
    this.Parent_Device_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Device_Type_Desc = null;
    } else {
    this.Device_Type_Desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Device_Type_Level = null;
    } else {
    this.Device_Type_Level = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Equip_Cate_Cd = null;
    } else {
    this.Equip_Cate_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Device_Spcl_Cd = null;
    } else {
    this.Device_Spcl_Cd = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Device_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Cd);
    }
    if (null == this.Device_Type_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Name);
    }
    if (null == this.Parent_Device_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parent_Device_Type_Cd);
    }
    if (null == this.Device_Type_Desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Desc);
    }
    if (null == this.Device_Type_Level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Device_Type_Level);
    }
    if (null == this.Equip_Cate_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Equip_Cate_Cd);
    }
    if (null == this.Device_Spcl_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Spcl_Cd);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Device_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Cd);
    }
    if (null == this.Device_Type_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Name);
    }
    if (null == this.Parent_Device_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Parent_Device_Type_Cd);
    }
    if (null == this.Device_Type_Desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Type_Desc);
    }
    if (null == this.Device_Type_Level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Device_Type_Level);
    }
    if (null == this.Equip_Cate_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Equip_Cate_Cd);
    }
    if (null == this.Device_Spcl_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Device_Spcl_Cd);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Cd==null?"\\N":Device_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Name==null?"\\N":Device_Type_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parent_Device_Type_Cd==null?"\\N":Parent_Device_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Desc==null?"\\N":Device_Type_Desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Level==null?"\\N":"" + Device_Type_Level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Equip_Cate_Cd==null?"\\N":Equip_Cate_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Spcl_Cd==null?"\\N":Device_Spcl_Cd, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Cd==null?"\\N":Device_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Name==null?"\\N":Device_Type_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Parent_Device_Type_Cd==null?"\\N":Parent_Device_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Desc==null?"\\N":Device_Type_Desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Type_Level==null?"\\N":"" + Device_Type_Level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Equip_Cate_Cd==null?"\\N":Equip_Cate_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Device_Spcl_Cd==null?"\\N":Device_Spcl_Cd, delimiters));
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
    if (__cur_str.equals("null")) { this.Device_Type_Cd = null; } else {
      this.Device_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Type_Name = null; } else {
      this.Device_Type_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parent_Device_Type_Cd = null; } else {
      this.Parent_Device_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Type_Desc = null; } else {
      this.Device_Type_Desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Device_Type_Level = null; } else {
      this.Device_Type_Level = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Equip_Cate_Cd = null; } else {
      this.Equip_Cate_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Spcl_Cd = null; } else {
      this.Device_Spcl_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Device_Type_Cd = null; } else {
      this.Device_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Type_Name = null; } else {
      this.Device_Type_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Parent_Device_Type_Cd = null; } else {
      this.Parent_Device_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Type_Desc = null; } else {
      this.Device_Type_Desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Device_Type_Level = null; } else {
      this.Device_Type_Level = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Equip_Cate_Cd = null; } else {
      this.Equip_Cate_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Device_Spcl_Cd = null; } else {
      this.Device_Spcl_Cd = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T99_STAT_DEVICE_TYPE_CD o = (T99_STAT_DEVICE_TYPE_CD) super.clone();
    return o;
  }

  public void clone0(T99_STAT_DEVICE_TYPE_CD o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Device_Type_Cd", this.Device_Type_Cd);
    __sqoop$field_map.put("Device_Type_Name", this.Device_Type_Name);
    __sqoop$field_map.put("Parent_Device_Type_Cd", this.Parent_Device_Type_Cd);
    __sqoop$field_map.put("Device_Type_Desc", this.Device_Type_Desc);
    __sqoop$field_map.put("Device_Type_Level", this.Device_Type_Level);
    __sqoop$field_map.put("Equip_Cate_Cd", this.Equip_Cate_Cd);
    __sqoop$field_map.put("Device_Spcl_Cd", this.Device_Spcl_Cd);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Device_Type_Cd", this.Device_Type_Cd);
    __sqoop$field_map.put("Device_Type_Name", this.Device_Type_Name);
    __sqoop$field_map.put("Parent_Device_Type_Cd", this.Parent_Device_Type_Cd);
    __sqoop$field_map.put("Device_Type_Desc", this.Device_Type_Desc);
    __sqoop$field_map.put("Device_Type_Level", this.Device_Type_Level);
    __sqoop$field_map.put("Equip_Cate_Cd", this.Equip_Cate_Cd);
    __sqoop$field_map.put("Device_Spcl_Cd", this.Device_Spcl_Cd);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
