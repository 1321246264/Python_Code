// ORM class for table 'T98_RUN_MAP_VERSION'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 26 16:53:18 CST 2020
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

public class T98_RUN_MAP_VERSION extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Run_Map_Version_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Run_Map_Version_Cd = (String)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Line_ID = (String)value;
      }
    });
    setters.put("Line_Nme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Line_Nme = (String)value;
      }
    });
    setters.put("Run_Map_Name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Run_Map_Name = (String)value;
      }
    });
    setters.put("Run_Map_Type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Run_Map_Type = (String)value;
      }
    });
    setters.put("Import_Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Import_Time = (String)value;
      }
    });
    setters.put("St_Execute_Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.St_Execute_Time = (String)value;
      }
    });
    setters.put("End_Execute_Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.End_Execute_Time = (String)value;
      }
    });
    setters.put("Auth_Department", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T98_RUN_MAP_VERSION.this.Auth_Department = (String)value;
      }
    });
  }
  public T98_RUN_MAP_VERSION() {
    init0();
  }
  private String Run_Map_Version_Cd;
  public String get_Run_Map_Version_Cd() {
    return Run_Map_Version_Cd;
  }
  public void set_Run_Map_Version_Cd(String Run_Map_Version_Cd) {
    this.Run_Map_Version_Cd = Run_Map_Version_Cd;
  }
  public T98_RUN_MAP_VERSION with_Run_Map_Version_Cd(String Run_Map_Version_Cd) {
    this.Run_Map_Version_Cd = Run_Map_Version_Cd;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T98_RUN_MAP_VERSION with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Line_Nme;
  public String get_Line_Nme() {
    return Line_Nme;
  }
  public void set_Line_Nme(String Line_Nme) {
    this.Line_Nme = Line_Nme;
  }
  public T98_RUN_MAP_VERSION with_Line_Nme(String Line_Nme) {
    this.Line_Nme = Line_Nme;
    return this;
  }
  private String Run_Map_Name;
  public String get_Run_Map_Name() {
    return Run_Map_Name;
  }
  public void set_Run_Map_Name(String Run_Map_Name) {
    this.Run_Map_Name = Run_Map_Name;
  }
  public T98_RUN_MAP_VERSION with_Run_Map_Name(String Run_Map_Name) {
    this.Run_Map_Name = Run_Map_Name;
    return this;
  }
  private String Run_Map_Type;
  public String get_Run_Map_Type() {
    return Run_Map_Type;
  }
  public void set_Run_Map_Type(String Run_Map_Type) {
    this.Run_Map_Type = Run_Map_Type;
  }
  public T98_RUN_MAP_VERSION with_Run_Map_Type(String Run_Map_Type) {
    this.Run_Map_Type = Run_Map_Type;
    return this;
  }
  private String Import_Time;
  public String get_Import_Time() {
    return Import_Time;
  }
  public void set_Import_Time(String Import_Time) {
    this.Import_Time = Import_Time;
  }
  public T98_RUN_MAP_VERSION with_Import_Time(String Import_Time) {
    this.Import_Time = Import_Time;
    return this;
  }
  private String St_Execute_Time;
  public String get_St_Execute_Time() {
    return St_Execute_Time;
  }
  public void set_St_Execute_Time(String St_Execute_Time) {
    this.St_Execute_Time = St_Execute_Time;
  }
  public T98_RUN_MAP_VERSION with_St_Execute_Time(String St_Execute_Time) {
    this.St_Execute_Time = St_Execute_Time;
    return this;
  }
  private String End_Execute_Time;
  public String get_End_Execute_Time() {
    return End_Execute_Time;
  }
  public void set_End_Execute_Time(String End_Execute_Time) {
    this.End_Execute_Time = End_Execute_Time;
  }
  public T98_RUN_MAP_VERSION with_End_Execute_Time(String End_Execute_Time) {
    this.End_Execute_Time = End_Execute_Time;
    return this;
  }
  private String Auth_Department;
  public String get_Auth_Department() {
    return Auth_Department;
  }
  public void set_Auth_Department(String Auth_Department) {
    this.Auth_Department = Auth_Department;
  }
  public T98_RUN_MAP_VERSION with_Auth_Department(String Auth_Department) {
    this.Auth_Department = Auth_Department;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_RUN_MAP_VERSION)) {
      return false;
    }
    T98_RUN_MAP_VERSION that = (T98_RUN_MAP_VERSION) o;
    boolean equal = true;
    equal = equal && (this.Run_Map_Version_Cd == null ? that.Run_Map_Version_Cd == null : this.Run_Map_Version_Cd.equals(that.Run_Map_Version_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Line_Nme == null ? that.Line_Nme == null : this.Line_Nme.equals(that.Line_Nme));
    equal = equal && (this.Run_Map_Name == null ? that.Run_Map_Name == null : this.Run_Map_Name.equals(that.Run_Map_Name));
    equal = equal && (this.Run_Map_Type == null ? that.Run_Map_Type == null : this.Run_Map_Type.equals(that.Run_Map_Type));
    equal = equal && (this.Import_Time == null ? that.Import_Time == null : this.Import_Time.equals(that.Import_Time));
    equal = equal && (this.St_Execute_Time == null ? that.St_Execute_Time == null : this.St_Execute_Time.equals(that.St_Execute_Time));
    equal = equal && (this.End_Execute_Time == null ? that.End_Execute_Time == null : this.End_Execute_Time.equals(that.End_Execute_Time));
    equal = equal && (this.Auth_Department == null ? that.Auth_Department == null : this.Auth_Department.equals(that.Auth_Department));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T98_RUN_MAP_VERSION)) {
      return false;
    }
    T98_RUN_MAP_VERSION that = (T98_RUN_MAP_VERSION) o;
    boolean equal = true;
    equal = equal && (this.Run_Map_Version_Cd == null ? that.Run_Map_Version_Cd == null : this.Run_Map_Version_Cd.equals(that.Run_Map_Version_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Line_Nme == null ? that.Line_Nme == null : this.Line_Nme.equals(that.Line_Nme));
    equal = equal && (this.Run_Map_Name == null ? that.Run_Map_Name == null : this.Run_Map_Name.equals(that.Run_Map_Name));
    equal = equal && (this.Run_Map_Type == null ? that.Run_Map_Type == null : this.Run_Map_Type.equals(that.Run_Map_Type));
    equal = equal && (this.Import_Time == null ? that.Import_Time == null : this.Import_Time.equals(that.Import_Time));
    equal = equal && (this.St_Execute_Time == null ? that.St_Execute_Time == null : this.St_Execute_Time.equals(that.St_Execute_Time));
    equal = equal && (this.End_Execute_Time == null ? that.End_Execute_Time == null : this.End_Execute_Time.equals(that.End_Execute_Time));
    equal = equal && (this.Auth_Department == null ? that.Auth_Department == null : this.Auth_Department.equals(that.Auth_Department));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Run_Map_Version_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_Nme = JdbcWritableBridge.readString(3, __dbResults);
    this.Run_Map_Name = JdbcWritableBridge.readString(4, __dbResults);
    this.Run_Map_Type = JdbcWritableBridge.readString(5, __dbResults);
    this.Import_Time = JdbcWritableBridge.readString(6, __dbResults);
    this.St_Execute_Time = JdbcWritableBridge.readString(7, __dbResults);
    this.End_Execute_Time = JdbcWritableBridge.readString(8, __dbResults);
    this.Auth_Department = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Run_Map_Version_Cd = JdbcWritableBridge.readString(1, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_Nme = JdbcWritableBridge.readString(3, __dbResults);
    this.Run_Map_Name = JdbcWritableBridge.readString(4, __dbResults);
    this.Run_Map_Type = JdbcWritableBridge.readString(5, __dbResults);
    this.Import_Time = JdbcWritableBridge.readString(6, __dbResults);
    this.St_Execute_Time = JdbcWritableBridge.readString(7, __dbResults);
    this.End_Execute_Time = JdbcWritableBridge.readString(8, __dbResults);
    this.Auth_Department = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeString(Run_Map_Version_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_Nme, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Run_Map_Name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Run_Map_Type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Import_Time, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(St_Execute_Time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(End_Execute_Time, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Auth_Department, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Run_Map_Version_Cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_Nme, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Run_Map_Name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Run_Map_Type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Import_Time, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(St_Execute_Time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(End_Execute_Time, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Auth_Department, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Run_Map_Version_Cd = null;
    } else {
    this.Run_Map_Version_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Line_Nme = null;
    } else {
    this.Line_Nme = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Run_Map_Name = null;
    } else {
    this.Run_Map_Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Run_Map_Type = null;
    } else {
    this.Run_Map_Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Import_Time = null;
    } else {
    this.Import_Time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.St_Execute_Time = null;
    } else {
    this.St_Execute_Time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.End_Execute_Time = null;
    } else {
    this.End_Execute_Time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Auth_Department = null;
    } else {
    this.Auth_Department = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Run_Map_Version_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Version_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Line_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_Nme);
    }
    if (null == this.Run_Map_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Name);
    }
    if (null == this.Run_Map_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Type);
    }
    if (null == this.Import_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Import_Time);
    }
    if (null == this.St_Execute_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, St_Execute_Time);
    }
    if (null == this.End_Execute_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, End_Execute_Time);
    }
    if (null == this.Auth_Department) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Auth_Department);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Run_Map_Version_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Version_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Line_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_Nme);
    }
    if (null == this.Run_Map_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Name);
    }
    if (null == this.Run_Map_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Run_Map_Type);
    }
    if (null == this.Import_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Import_Time);
    }
    if (null == this.St_Execute_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, St_Execute_Time);
    }
    if (null == this.End_Execute_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, End_Execute_Time);
    }
    if (null == this.Auth_Department) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Auth_Department);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Version_Cd==null?"\\N":Run_Map_Version_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Nme==null?"\\N":Line_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Name==null?"\\N":Run_Map_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Type==null?"\\N":Run_Map_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Import_Time==null?"\\N":Import_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(St_Execute_Time==null?"\\N":St_Execute_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Execute_Time==null?"\\N":End_Execute_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Auth_Department==null?"\\N":Auth_Department, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Version_Cd==null?"\\N":Run_Map_Version_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_Nme==null?"\\N":Line_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Name==null?"\\N":Run_Map_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Run_Map_Type==null?"\\N":Run_Map_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Import_Time==null?"\\N":Import_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(St_Execute_Time==null?"\\N":St_Execute_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Execute_Time==null?"\\N":End_Execute_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Auth_Department==null?"\\N":Auth_Department, delimiters));
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
    if (__cur_str.equals("null")) { this.Run_Map_Version_Cd = null; } else {
      this.Run_Map_Version_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Line_Nme = null; } else {
      this.Line_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Run_Map_Name = null; } else {
      this.Run_Map_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Run_Map_Type = null; } else {
      this.Run_Map_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Import_Time = null; } else {
      this.Import_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.St_Execute_Time = null; } else {
      this.St_Execute_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.End_Execute_Time = null; } else {
      this.End_Execute_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Auth_Department = null; } else {
      this.Auth_Department = __cur_str;
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
    if (__cur_str.equals("null")) { this.Run_Map_Version_Cd = null; } else {
      this.Run_Map_Version_Cd = __cur_str;
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
    if (__cur_str.equals("null")) { this.Line_Nme = null; } else {
      this.Line_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Run_Map_Name = null; } else {
      this.Run_Map_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Run_Map_Type = null; } else {
      this.Run_Map_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Import_Time = null; } else {
      this.Import_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.St_Execute_Time = null; } else {
      this.St_Execute_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.End_Execute_Time = null; } else {
      this.End_Execute_Time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Auth_Department = null; } else {
      this.Auth_Department = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T98_RUN_MAP_VERSION o = (T98_RUN_MAP_VERSION) super.clone();
    return o;
  }

  public void clone0(T98_RUN_MAP_VERSION o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Run_Map_Version_Cd", this.Run_Map_Version_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Line_Nme", this.Line_Nme);
    __sqoop$field_map.put("Run_Map_Name", this.Run_Map_Name);
    __sqoop$field_map.put("Run_Map_Type", this.Run_Map_Type);
    __sqoop$field_map.put("Import_Time", this.Import_Time);
    __sqoop$field_map.put("St_Execute_Time", this.St_Execute_Time);
    __sqoop$field_map.put("End_Execute_Time", this.End_Execute_Time);
    __sqoop$field_map.put("Auth_Department", this.Auth_Department);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Run_Map_Version_Cd", this.Run_Map_Version_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Line_Nme", this.Line_Nme);
    __sqoop$field_map.put("Run_Map_Name", this.Run_Map_Name);
    __sqoop$field_map.put("Run_Map_Type", this.Run_Map_Type);
    __sqoop$field_map.put("Import_Time", this.Import_Time);
    __sqoop$field_map.put("St_Execute_Time", this.St_Execute_Time);
    __sqoop$field_map.put("End_Execute_Time", this.End_Execute_Time);
    __sqoop$field_map.put("Auth_Department", this.Auth_Department);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
