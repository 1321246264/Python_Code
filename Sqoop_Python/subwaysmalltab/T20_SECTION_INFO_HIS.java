// ORM class for table 'T20_SECTION_INFO_HIS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 03 09:47:09 CST 2020
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

public class T20_SECTION_INFO_HIS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Section_Id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Section_Id = (String)value;
      }
    });
    setters.put("Start_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Start_Tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("Section_Name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Section_Name = (String)value;
      }
    });
    setters.put("Section_Run_Duration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Section_Run_Duration = (Integer)value;
      }
    });
    setters.put("Section_Stop_Duration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Section_Stop_Duration = (Integer)value;
      }
    });
    setters.put("Section_Run_Distance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Section_Run_Distance = (java.math.BigDecimal)value;
      }
    });
    setters.put("Valid_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Valid_Ind = (Integer)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("End_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_SECTION_INFO_HIS.this.End_Tm = (java.sql.Timestamp)value;
      }
    });
  }
  public T20_SECTION_INFO_HIS() {
    init0();
  }
  private String Section_Id;
  public String get_Section_Id() {
    return Section_Id;
  }
  public void set_Section_Id(String Section_Id) {
    this.Section_Id = Section_Id;
  }
  public T20_SECTION_INFO_HIS with_Section_Id(String Section_Id) {
    this.Section_Id = Section_Id;
    return this;
  }
  private java.sql.Timestamp Start_Tm;
  public java.sql.Timestamp get_Start_Tm() {
    return Start_Tm;
  }
  public void set_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
  }
  public T20_SECTION_INFO_HIS with_Start_Tm(java.sql.Timestamp Start_Tm) {
    this.Start_Tm = Start_Tm;
    return this;
  }
  private String Section_Name;
  public String get_Section_Name() {
    return Section_Name;
  }
  public void set_Section_Name(String Section_Name) {
    this.Section_Name = Section_Name;
  }
  public T20_SECTION_INFO_HIS with_Section_Name(String Section_Name) {
    this.Section_Name = Section_Name;
    return this;
  }
  private Integer Section_Run_Duration;
  public Integer get_Section_Run_Duration() {
    return Section_Run_Duration;
  }
  public void set_Section_Run_Duration(Integer Section_Run_Duration) {
    this.Section_Run_Duration = Section_Run_Duration;
  }
  public T20_SECTION_INFO_HIS with_Section_Run_Duration(Integer Section_Run_Duration) {
    this.Section_Run_Duration = Section_Run_Duration;
    return this;
  }
  private Integer Section_Stop_Duration;
  public Integer get_Section_Stop_Duration() {
    return Section_Stop_Duration;
  }
  public void set_Section_Stop_Duration(Integer Section_Stop_Duration) {
    this.Section_Stop_Duration = Section_Stop_Duration;
  }
  public T20_SECTION_INFO_HIS with_Section_Stop_Duration(Integer Section_Stop_Duration) {
    this.Section_Stop_Duration = Section_Stop_Duration;
    return this;
  }
  private java.math.BigDecimal Section_Run_Distance;
  public java.math.BigDecimal get_Section_Run_Distance() {
    return Section_Run_Distance;
  }
  public void set_Section_Run_Distance(java.math.BigDecimal Section_Run_Distance) {
    this.Section_Run_Distance = Section_Run_Distance;
  }
  public T20_SECTION_INFO_HIS with_Section_Run_Distance(java.math.BigDecimal Section_Run_Distance) {
    this.Section_Run_Distance = Section_Run_Distance;
    return this;
  }
  private Integer Valid_Ind;
  public Integer get_Valid_Ind() {
    return Valid_Ind;
  }
  public void set_Valid_Ind(Integer Valid_Ind) {
    this.Valid_Ind = Valid_Ind;
  }
  public T20_SECTION_INFO_HIS with_Valid_Ind(Integer Valid_Ind) {
    this.Valid_Ind = Valid_Ind;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public T20_SECTION_INFO_HIS with_Source_Sys_Cd(String Source_Sys_Cd) {
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
  public T20_SECTION_INFO_HIS with_End_Tm(java.sql.Timestamp End_Tm) {
    this.End_Tm = End_Tm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_SECTION_INFO_HIS)) {
      return false;
    }
    T20_SECTION_INFO_HIS that = (T20_SECTION_INFO_HIS) o;
    boolean equal = true;
    equal = equal && (this.Section_Id == null ? that.Section_Id == null : this.Section_Id.equals(that.Section_Id));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Section_Name == null ? that.Section_Name == null : this.Section_Name.equals(that.Section_Name));
    equal = equal && (this.Section_Run_Duration == null ? that.Section_Run_Duration == null : this.Section_Run_Duration.equals(that.Section_Run_Duration));
    equal = equal && (this.Section_Stop_Duration == null ? that.Section_Stop_Duration == null : this.Section_Stop_Duration.equals(that.Section_Stop_Duration));
    equal = equal && (this.Section_Run_Distance == null ? that.Section_Run_Distance == null : this.Section_Run_Distance.equals(that.Section_Run_Distance));
    equal = equal && (this.Valid_Ind == null ? that.Valid_Ind == null : this.Valid_Ind.equals(that.Valid_Ind));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_SECTION_INFO_HIS)) {
      return false;
    }
    T20_SECTION_INFO_HIS that = (T20_SECTION_INFO_HIS) o;
    boolean equal = true;
    equal = equal && (this.Section_Id == null ? that.Section_Id == null : this.Section_Id.equals(that.Section_Id));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.Section_Name == null ? that.Section_Name == null : this.Section_Name.equals(that.Section_Name));
    equal = equal && (this.Section_Run_Duration == null ? that.Section_Run_Duration == null : this.Section_Run_Duration.equals(that.Section_Run_Duration));
    equal = equal && (this.Section_Stop_Duration == null ? that.Section_Stop_Duration == null : this.Section_Stop_Duration.equals(that.Section_Stop_Duration));
    equal = equal && (this.Section_Run_Distance == null ? that.Section_Run_Distance == null : this.Section_Run_Distance.equals(that.Section_Run_Distance));
    equal = equal && (this.Valid_Ind == null ? that.Valid_Ind == null : this.Valid_Ind.equals(that.Valid_Ind));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Section_Id = JdbcWritableBridge.readString(1, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.Section_Name = JdbcWritableBridge.readString(3, __dbResults);
    this.Section_Run_Duration = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Section_Stop_Duration = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Section_Run_Distance = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Valid_Ind = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Section_Id = JdbcWritableBridge.readString(1, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.Section_Name = JdbcWritableBridge.readString(3, __dbResults);
    this.Section_Run_Duration = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Section_Stop_Duration = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Section_Run_Distance = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Valid_Ind = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(8, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeString(Section_Id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Section_Name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Section_Run_Duration, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Section_Stop_Duration, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Run_Distance, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Valid_Ind, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Section_Id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Start_Tm, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Section_Name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Section_Run_Duration, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Section_Stop_Duration, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Section_Run_Distance, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Valid_Ind, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(End_Tm, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Section_Id = null;
    } else {
    this.Section_Id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Tm = null;
    } else {
    this.Start_Tm = new Timestamp(__dataIn.readLong());
    this.Start_Tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Name = null;
    } else {
    this.Section_Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Run_Duration = null;
    } else {
    this.Section_Run_Duration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Stop_Duration = null;
    } else {
    this.Section_Stop_Duration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Section_Run_Distance = null;
    } else {
    this.Section_Run_Distance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Valid_Ind = null;
    } else {
    this.Valid_Ind = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.Section_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Section_Id);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Section_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Section_Name);
    }
    if (null == this.Section_Run_Duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Section_Run_Duration);
    }
    if (null == this.Section_Stop_Duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Section_Stop_Duration);
    }
    if (null == this.Section_Run_Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Run_Distance, __dataOut);
    }
    if (null == this.Valid_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Valid_Ind);
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
    if (null == this.Section_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Section_Id);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    __dataOut.writeInt(this.Start_Tm.getNanos());
    }
    if (null == this.Section_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Section_Name);
    }
    if (null == this.Section_Run_Duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Section_Run_Duration);
    }
    if (null == this.Section_Stop_Duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Section_Stop_Duration);
    }
    if (null == this.Section_Run_Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Section_Run_Distance, __dataOut);
    }
    if (null == this.Valid_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Valid_Ind);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Id==null?"\\N":Section_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Name==null?"\\N":Section_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Run_Duration==null?"\\N":"" + Section_Run_Duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Stop_Duration==null?"\\N":"" + Section_Stop_Duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Run_Distance==null?"\\N":Section_Run_Distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Valid_Ind==null?"\\N":"" + Valid_Ind, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Id==null?"\\N":Section_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Name==null?"\\N":Section_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Run_Duration==null?"\\N":"" + Section_Run_Duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Stop_Duration==null?"\\N":"" + Section_Stop_Duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Section_Run_Distance==null?"\\N":Section_Run_Distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Valid_Ind==null?"\\N":"" + Valid_Ind, delimiters));
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
    if (__cur_str.equals("null")) { this.Section_Id = null; } else {
      this.Section_Id = __cur_str;
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
    if (__cur_str.equals("null")) { this.Section_Name = null; } else {
      this.Section_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Run_Duration = null; } else {
      this.Section_Run_Duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Stop_Duration = null; } else {
      this.Section_Stop_Duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Run_Distance = null; } else {
      this.Section_Run_Distance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Valid_Ind = null; } else {
      this.Valid_Ind = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Section_Id = null; } else {
      this.Section_Id = __cur_str;
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
    if (__cur_str.equals("null")) { this.Section_Name = null; } else {
      this.Section_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Run_Duration = null; } else {
      this.Section_Run_Duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Stop_Duration = null; } else {
      this.Section_Stop_Duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Section_Run_Distance = null; } else {
      this.Section_Run_Distance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Valid_Ind = null; } else {
      this.Valid_Ind = Integer.valueOf(__cur_str);
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
    T20_SECTION_INFO_HIS o = (T20_SECTION_INFO_HIS) super.clone();
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
    return o;
  }

  public void clone0(T20_SECTION_INFO_HIS o) throws CloneNotSupportedException {
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Timestamp) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Timestamp) o.End_Tm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Section_Id", this.Section_Id);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Section_Name", this.Section_Name);
    __sqoop$field_map.put("Section_Run_Duration", this.Section_Run_Duration);
    __sqoop$field_map.put("Section_Stop_Duration", this.Section_Stop_Duration);
    __sqoop$field_map.put("Section_Run_Distance", this.Section_Run_Distance);
    __sqoop$field_map.put("Valid_Ind", this.Valid_Ind);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Section_Id", this.Section_Id);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("Section_Name", this.Section_Name);
    __sqoop$field_map.put("Section_Run_Duration", this.Section_Run_Duration);
    __sqoop$field_map.put("Section_Stop_Duration", this.Section_Stop_Duration);
    __sqoop$field_map.put("Section_Run_Distance", this.Section_Run_Distance);
    __sqoop$field_map.put("Valid_Ind", this.Valid_Ind);
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
