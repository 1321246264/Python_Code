// ORM class for table 'T72_ENGCSPT_DATE_ST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 29 16:56:36 CST 2020
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

public class T72_ENGCSPT_DATE_ST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Stat_Period_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.Stat_Period_Cd = (String)value;
      }
    });
    setters.put("HouseHld_pty_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.HouseHld_pty_ID = (String)value;
      }
    });
    setters.put("EngCspt_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.EngCspt_Cd = (String)value;
      }
    });
    setters.put("HouseHld_Lvl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.HouseHld_Lvl = (Integer)value;
      }
    });
    setters.put("Measr_Unit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.Measr_Unit = (String)value;
      }
    });
    setters.put("Sum_Val", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.Sum_Val = (java.math.BigDecimal)value;
      }
    });
    setters.put("Data_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T72_ENGCSPT_DATE_ST.this.Data_Dt = (java.sql.Date)value;
      }
    });
  }
  public T72_ENGCSPT_DATE_ST() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T72_ENGCSPT_DATE_ST with_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
    return this;
  }
  private String Stat_Period_Cd;
  public String get_Stat_Period_Cd() {
    return Stat_Period_Cd;
  }
  public void set_Stat_Period_Cd(String Stat_Period_Cd) {
    this.Stat_Period_Cd = Stat_Period_Cd;
  }
  public T72_ENGCSPT_DATE_ST with_Stat_Period_Cd(String Stat_Period_Cd) {
    this.Stat_Period_Cd = Stat_Period_Cd;
    return this;
  }
  private String HouseHld_pty_ID;
  public String get_HouseHld_pty_ID() {
    return HouseHld_pty_ID;
  }
  public void set_HouseHld_pty_ID(String HouseHld_pty_ID) {
    this.HouseHld_pty_ID = HouseHld_pty_ID;
  }
  public T72_ENGCSPT_DATE_ST with_HouseHld_pty_ID(String HouseHld_pty_ID) {
    this.HouseHld_pty_ID = HouseHld_pty_ID;
    return this;
  }
  private String EngCspt_Cd;
  public String get_EngCspt_Cd() {
    return EngCspt_Cd;
  }
  public void set_EngCspt_Cd(String EngCspt_Cd) {
    this.EngCspt_Cd = EngCspt_Cd;
  }
  public T72_ENGCSPT_DATE_ST with_EngCspt_Cd(String EngCspt_Cd) {
    this.EngCspt_Cd = EngCspt_Cd;
    return this;
  }
  private Integer HouseHld_Lvl;
  public Integer get_HouseHld_Lvl() {
    return HouseHld_Lvl;
  }
  public void set_HouseHld_Lvl(Integer HouseHld_Lvl) {
    this.HouseHld_Lvl = HouseHld_Lvl;
  }
  public T72_ENGCSPT_DATE_ST with_HouseHld_Lvl(Integer HouseHld_Lvl) {
    this.HouseHld_Lvl = HouseHld_Lvl;
    return this;
  }
  private String Measr_Unit;
  public String get_Measr_Unit() {
    return Measr_Unit;
  }
  public void set_Measr_Unit(String Measr_Unit) {
    this.Measr_Unit = Measr_Unit;
  }
  public T72_ENGCSPT_DATE_ST with_Measr_Unit(String Measr_Unit) {
    this.Measr_Unit = Measr_Unit;
    return this;
  }
  private java.math.BigDecimal Sum_Val;
  public java.math.BigDecimal get_Sum_Val() {
    return Sum_Val;
  }
  public void set_Sum_Val(java.math.BigDecimal Sum_Val) {
    this.Sum_Val = Sum_Val;
  }
  public T72_ENGCSPT_DATE_ST with_Sum_Val(java.math.BigDecimal Sum_Val) {
    this.Sum_Val = Sum_Val;
    return this;
  }
  private java.sql.Date Data_Dt;
  public java.sql.Date get_Data_Dt() {
    return Data_Dt;
  }
  public void set_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
  }
  public T72_ENGCSPT_DATE_ST with_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T72_ENGCSPT_DATE_ST)) {
      return false;
    }
    T72_ENGCSPT_DATE_ST that = (T72_ENGCSPT_DATE_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Period_Cd == null ? that.Stat_Period_Cd == null : this.Stat_Period_Cd.equals(that.Stat_Period_Cd));
    equal = equal && (this.HouseHld_pty_ID == null ? that.HouseHld_pty_ID == null : this.HouseHld_pty_ID.equals(that.HouseHld_pty_ID));
    equal = equal && (this.EngCspt_Cd == null ? that.EngCspt_Cd == null : this.EngCspt_Cd.equals(that.EngCspt_Cd));
    equal = equal && (this.HouseHld_Lvl == null ? that.HouseHld_Lvl == null : this.HouseHld_Lvl.equals(that.HouseHld_Lvl));
    equal = equal && (this.Measr_Unit == null ? that.Measr_Unit == null : this.Measr_Unit.equals(that.Measr_Unit));
    equal = equal && (this.Sum_Val == null ? that.Sum_Val == null : this.Sum_Val.equals(that.Sum_Val));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T72_ENGCSPT_DATE_ST)) {
      return false;
    }
    T72_ENGCSPT_DATE_ST that = (T72_ENGCSPT_DATE_ST) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Stat_Period_Cd == null ? that.Stat_Period_Cd == null : this.Stat_Period_Cd.equals(that.Stat_Period_Cd));
    equal = equal && (this.HouseHld_pty_ID == null ? that.HouseHld_pty_ID == null : this.HouseHld_pty_ID.equals(that.HouseHld_pty_ID));
    equal = equal && (this.EngCspt_Cd == null ? that.EngCspt_Cd == null : this.EngCspt_Cd.equals(that.EngCspt_Cd));
    equal = equal && (this.HouseHld_Lvl == null ? that.HouseHld_Lvl == null : this.HouseHld_Lvl.equals(that.HouseHld_Lvl));
    equal = equal && (this.Measr_Unit == null ? that.Measr_Unit == null : this.Measr_Unit.equals(that.Measr_Unit));
    equal = equal && (this.Sum_Val == null ? that.Sum_Val == null : this.Sum_Val.equals(that.Sum_Val));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Period_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.HouseHld_pty_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.EngCspt_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.HouseHld_Lvl = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Measr_Unit = JdbcWritableBridge.readString(6, __dbResults);
    this.Sum_Val = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Stat_Period_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.HouseHld_pty_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.EngCspt_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.HouseHld_Lvl = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Measr_Unit = JdbcWritableBridge.readString(6, __dbResults);
    this.Sum_Val = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(8, __dbResults);
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
    JdbcWritableBridge.writeString(Stat_Period_Cd, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HouseHld_pty_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EngCspt_Cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(HouseHld_Lvl, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Measr_Unit, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sum_Val, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 8 + __off, 91, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Stat_Period_Cd, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HouseHld_pty_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EngCspt_Cd, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(HouseHld_Lvl, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Measr_Unit, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sum_Val, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 8 + __off, 91, __dbStmt);
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
        this.Stat_Period_Cd = null;
    } else {
    this.Stat_Period_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HouseHld_pty_ID = null;
    } else {
    this.HouseHld_pty_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EngCspt_Cd = null;
    } else {
    this.EngCspt_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HouseHld_Lvl = null;
    } else {
    this.HouseHld_Lvl = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Measr_Unit = null;
    } else {
    this.Measr_Unit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Sum_Val = null;
    } else {
    this.Sum_Val = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Dt = null;
    } else {
    this.Data_Dt = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Stat_Period_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Period_Cd);
    }
    if (null == this.HouseHld_pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HouseHld_pty_ID);
    }
    if (null == this.EngCspt_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EngCspt_Cd);
    }
    if (null == this.HouseHld_Lvl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.HouseHld_Lvl);
    }
    if (null == this.Measr_Unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Measr_Unit);
    }
    if (null == this.Sum_Val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Sum_Val, __dataOut);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Stat_Period_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Stat_Period_Cd);
    }
    if (null == this.HouseHld_pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HouseHld_pty_ID);
    }
    if (null == this.EngCspt_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EngCspt_Cd);
    }
    if (null == this.HouseHld_Lvl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.HouseHld_Lvl);
    }
    if (null == this.Measr_Unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Measr_Unit);
    }
    if (null == this.Sum_Val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Sum_Val, __dataOut);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Period_Cd==null?"\\N":Stat_Period_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseHld_pty_ID==null?"\\N":HouseHld_pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EngCspt_Cd==null?"\\N":EngCspt_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseHld_Lvl==null?"\\N":"" + HouseHld_Lvl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Measr_Unit==null?"\\N":Measr_Unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sum_Val==null?"\\N":Sum_Val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Period_Cd==null?"\\N":Stat_Period_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseHld_pty_ID==null?"\\N":HouseHld_pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EngCspt_Cd==null?"\\N":EngCspt_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseHld_Lvl==null?"\\N":"" + HouseHld_Lvl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Measr_Unit==null?"\\N":Measr_Unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sum_Val==null?"\\N":Sum_Val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
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
    if (__cur_str.equals("null")) { this.Stat_Period_Cd = null; } else {
      this.Stat_Period_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HouseHld_pty_ID = null; } else {
      this.HouseHld_pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EngCspt_Cd = null; } else {
      this.EngCspt_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HouseHld_Lvl = null; } else {
      this.HouseHld_Lvl = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Measr_Unit = null; } else {
      this.Measr_Unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sum_Val = null; } else {
      this.Sum_Val = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Stat_Period_Cd = null; } else {
      this.Stat_Period_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HouseHld_pty_ID = null; } else {
      this.HouseHld_pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EngCspt_Cd = null; } else {
      this.EngCspt_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HouseHld_Lvl = null; } else {
      this.HouseHld_Lvl = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Measr_Unit = null; } else {
      this.Measr_Unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sum_Val = null; } else {
      this.Sum_Val = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T72_ENGCSPT_DATE_ST o = (T72_ENGCSPT_DATE_ST) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(T72_ENGCSPT_DATE_ST o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Period_Cd", this.Stat_Period_Cd);
    __sqoop$field_map.put("HouseHld_pty_ID", this.HouseHld_pty_ID);
    __sqoop$field_map.put("EngCspt_Cd", this.EngCspt_Cd);
    __sqoop$field_map.put("HouseHld_Lvl", this.HouseHld_Lvl);
    __sqoop$field_map.put("Measr_Unit", this.Measr_Unit);
    __sqoop$field_map.put("Sum_Val", this.Sum_Val);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Stat_Period_Cd", this.Stat_Period_Cd);
    __sqoop$field_map.put("HouseHld_pty_ID", this.HouseHld_pty_ID);
    __sqoop$field_map.put("EngCspt_Cd", this.EngCspt_Cd);
    __sqoop$field_map.put("HouseHld_Lvl", this.HouseHld_Lvl);
    __sqoop$field_map.put("Measr_Unit", this.Measr_Unit);
    __sqoop$field_map.put("Sum_Val", this.Sum_Val);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
