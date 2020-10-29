// ORM class for table 'T71_STATION_CHECK'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 29 16:55:02 CST 2020
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

public class T71_STATION_CHECK extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Stat_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Stat_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Station_Nme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Station_Nme = (String)value;
      }
    });
    setters.put("Start_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Start_Tm = (java.sql.Time)value;
      }
    });
    setters.put("End_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.End_Tm = (java.sql.Time)value;
      }
    });
    setters.put("Outside_Check_Queue_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Outside_Check_Queue_Num = (java.math.BigDecimal)value;
      }
    });
    setters.put("Check_Queue_Mnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Check_Queue_Mnt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Opr_Pty_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Opr_Pty_ID = (String)value;
      }
    });
    setters.put("Period_Type_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T71_STATION_CHECK.this.Period_Type_Ind = (String)value;
      }
    });
  }
  public T71_STATION_CHECK() {
    init0();
  }
  private java.sql.Date Stat_Dt;
  public java.sql.Date get_Stat_Dt() {
    return Stat_Dt;
  }
  public void set_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
  }
  public T71_STATION_CHECK with_Stat_Dt(java.sql.Date Stat_Dt) {
    this.Stat_Dt = Stat_Dt;
    return this;
  }
  private String Station_Nme;
  public String get_Station_Nme() {
    return Station_Nme;
  }
  public void set_Station_Nme(String Station_Nme) {
    this.Station_Nme = Station_Nme;
  }
  public T71_STATION_CHECK with_Station_Nme(String Station_Nme) {
    this.Station_Nme = Station_Nme;
    return this;
  }
  private java.sql.Time Start_Tm;
  public java.sql.Time get_Start_Tm() {
    return Start_Tm;
  }
  public void set_Start_Tm(java.sql.Time Start_Tm) {
    this.Start_Tm = Start_Tm;
  }
  public T71_STATION_CHECK with_Start_Tm(java.sql.Time Start_Tm) {
    this.Start_Tm = Start_Tm;
    return this;
  }
  private java.sql.Time End_Tm;
  public java.sql.Time get_End_Tm() {
    return End_Tm;
  }
  public void set_End_Tm(java.sql.Time End_Tm) {
    this.End_Tm = End_Tm;
  }
  public T71_STATION_CHECK with_End_Tm(java.sql.Time End_Tm) {
    this.End_Tm = End_Tm;
    return this;
  }
  private java.math.BigDecimal Outside_Check_Queue_Num;
  public java.math.BigDecimal get_Outside_Check_Queue_Num() {
    return Outside_Check_Queue_Num;
  }
  public void set_Outside_Check_Queue_Num(java.math.BigDecimal Outside_Check_Queue_Num) {
    this.Outside_Check_Queue_Num = Outside_Check_Queue_Num;
  }
  public T71_STATION_CHECK with_Outside_Check_Queue_Num(java.math.BigDecimal Outside_Check_Queue_Num) {
    this.Outside_Check_Queue_Num = Outside_Check_Queue_Num;
    return this;
  }
  private java.math.BigDecimal Check_Queue_Mnt;
  public java.math.BigDecimal get_Check_Queue_Mnt() {
    return Check_Queue_Mnt;
  }
  public void set_Check_Queue_Mnt(java.math.BigDecimal Check_Queue_Mnt) {
    this.Check_Queue_Mnt = Check_Queue_Mnt;
  }
  public T71_STATION_CHECK with_Check_Queue_Mnt(java.math.BigDecimal Check_Queue_Mnt) {
    this.Check_Queue_Mnt = Check_Queue_Mnt;
    return this;
  }
  private String Opr_Pty_ID;
  public String get_Opr_Pty_ID() {
    return Opr_Pty_ID;
  }
  public void set_Opr_Pty_ID(String Opr_Pty_ID) {
    this.Opr_Pty_ID = Opr_Pty_ID;
  }
  public T71_STATION_CHECK with_Opr_Pty_ID(String Opr_Pty_ID) {
    this.Opr_Pty_ID = Opr_Pty_ID;
    return this;
  }
  private String Period_Type_Ind;
  public String get_Period_Type_Ind() {
    return Period_Type_Ind;
  }
  public void set_Period_Type_Ind(String Period_Type_Ind) {
    this.Period_Type_Ind = Period_Type_Ind;
  }
  public T71_STATION_CHECK with_Period_Type_Ind(String Period_Type_Ind) {
    this.Period_Type_Ind = Period_Type_Ind;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_STATION_CHECK)) {
      return false;
    }
    T71_STATION_CHECK that = (T71_STATION_CHECK) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Station_Nme == null ? that.Station_Nme == null : this.Station_Nme.equals(that.Station_Nme));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    equal = equal && (this.Outside_Check_Queue_Num == null ? that.Outside_Check_Queue_Num == null : this.Outside_Check_Queue_Num.equals(that.Outside_Check_Queue_Num));
    equal = equal && (this.Check_Queue_Mnt == null ? that.Check_Queue_Mnt == null : this.Check_Queue_Mnt.equals(that.Check_Queue_Mnt));
    equal = equal && (this.Opr_Pty_ID == null ? that.Opr_Pty_ID == null : this.Opr_Pty_ID.equals(that.Opr_Pty_ID));
    equal = equal && (this.Period_Type_Ind == null ? that.Period_Type_Ind == null : this.Period_Type_Ind.equals(that.Period_Type_Ind));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T71_STATION_CHECK)) {
      return false;
    }
    T71_STATION_CHECK that = (T71_STATION_CHECK) o;
    boolean equal = true;
    equal = equal && (this.Stat_Dt == null ? that.Stat_Dt == null : this.Stat_Dt.equals(that.Stat_Dt));
    equal = equal && (this.Station_Nme == null ? that.Station_Nme == null : this.Station_Nme.equals(that.Station_Nme));
    equal = equal && (this.Start_Tm == null ? that.Start_Tm == null : this.Start_Tm.equals(that.Start_Tm));
    equal = equal && (this.End_Tm == null ? that.End_Tm == null : this.End_Tm.equals(that.End_Tm));
    equal = equal && (this.Outside_Check_Queue_Num == null ? that.Outside_Check_Queue_Num == null : this.Outside_Check_Queue_Num.equals(that.Outside_Check_Queue_Num));
    equal = equal && (this.Check_Queue_Mnt == null ? that.Check_Queue_Mnt == null : this.Check_Queue_Mnt.equals(that.Check_Queue_Mnt));
    equal = equal && (this.Opr_Pty_ID == null ? that.Opr_Pty_ID == null : this.Opr_Pty_ID.equals(that.Opr_Pty_ID));
    equal = equal && (this.Period_Type_Ind == null ? that.Period_Type_Ind == null : this.Period_Type_Ind.equals(that.Period_Type_Ind));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Station_Nme = JdbcWritableBridge.readString(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTime(3, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTime(4, __dbResults);
    this.Outside_Check_Queue_Num = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Check_Queue_Mnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Opr_Pty_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.Period_Type_Ind = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Stat_Dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.Station_Nme = JdbcWritableBridge.readString(2, __dbResults);
    this.Start_Tm = JdbcWritableBridge.readTime(3, __dbResults);
    this.End_Tm = JdbcWritableBridge.readTime(4, __dbResults);
    this.Outside_Check_Queue_Num = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Check_Queue_Mnt = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Opr_Pty_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.Period_Type_Ind = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeString(Station_Nme, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(Start_Tm, 3 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(End_Tm, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Outside_Check_Queue_Num, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Check_Queue_Mnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Opr_Pty_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Period_Type_Ind, 8 + __off, 12, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Stat_Dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Station_Nme, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(Start_Tm, 3 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(End_Tm, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Outside_Check_Queue_Num, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Check_Queue_Mnt, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Opr_Pty_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Period_Type_Ind, 8 + __off, 12, __dbStmt);
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
        this.Station_Nme = null;
    } else {
    this.Station_Nme = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Tm = null;
    } else {
    this.Start_Tm = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.End_Tm = null;
    } else {
    this.End_Tm = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Outside_Check_Queue_Num = null;
    } else {
    this.Outside_Check_Queue_Num = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Check_Queue_Mnt = null;
    } else {
    this.Check_Queue_Mnt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Opr_Pty_ID = null;
    } else {
    this.Opr_Pty_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Period_Type_Ind = null;
    } else {
    this.Period_Type_Ind = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Station_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Nme);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    }
    if (null == this.End_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Tm.getTime());
    }
    if (null == this.Outside_Check_Queue_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Outside_Check_Queue_Num, __dataOut);
    }
    if (null == this.Check_Queue_Mnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Check_Queue_Mnt, __dataOut);
    }
    if (null == this.Opr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Opr_Pty_ID);
    }
    if (null == this.Period_Type_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Period_Type_Ind);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Stat_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stat_Dt.getTime());
    }
    if (null == this.Station_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Nme);
    }
    if (null == this.Start_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Tm.getTime());
    }
    if (null == this.End_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Tm.getTime());
    }
    if (null == this.Outside_Check_Queue_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Outside_Check_Queue_Num, __dataOut);
    }
    if (null == this.Check_Queue_Mnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Check_Queue_Mnt, __dataOut);
    }
    if (null == this.Opr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Opr_Pty_ID);
    }
    if (null == this.Period_Type_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Period_Type_Ind);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Nme==null?"\\N":Station_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Tm==null?"\\N":"" + End_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Outside_Check_Queue_Num==null?"\\N":Outside_Check_Queue_Num.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Check_Queue_Mnt==null?"\\N":Check_Queue_Mnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Opr_Pty_ID==null?"\\N":Opr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Period_Type_Ind==null?"\\N":Period_Type_Ind, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Stat_Dt==null?"\\N":"" + Stat_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Nme==null?"\\N":Station_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Tm==null?"\\N":"" + Start_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Tm==null?"\\N":"" + End_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Outside_Check_Queue_Num==null?"\\N":Outside_Check_Queue_Num.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Check_Queue_Mnt==null?"\\N":Check_Queue_Mnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Opr_Pty_ID==null?"\\N":Opr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Period_Type_Ind==null?"\\N":Period_Type_Ind, delimiters));
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
    if (__cur_str.equals("null")) { this.Station_Nme = null; } else {
      this.Station_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Tm = null; } else {
      this.End_Tm = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Outside_Check_Queue_Num = null; } else {
      this.Outside_Check_Queue_Num = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Check_Queue_Mnt = null; } else {
      this.Check_Queue_Mnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Opr_Pty_ID = null; } else {
      this.Opr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Period_Type_Ind = null; } else {
      this.Period_Type_Ind = __cur_str;
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
    if (__cur_str.equals("null")) { this.Station_Nme = null; } else {
      this.Station_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Tm = null; } else {
      this.Start_Tm = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Tm = null; } else {
      this.End_Tm = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Outside_Check_Queue_Num = null; } else {
      this.Outside_Check_Queue_Num = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Check_Queue_Mnt = null; } else {
      this.Check_Queue_Mnt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Opr_Pty_ID = null; } else {
      this.Opr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Period_Type_Ind = null; } else {
      this.Period_Type_Ind = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T71_STATION_CHECK o = (T71_STATION_CHECK) super.clone();
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Time) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Time) o.End_Tm.clone() : null;
    return o;
  }

  public void clone0(T71_STATION_CHECK o) throws CloneNotSupportedException {
    o.Stat_Dt = (o.Stat_Dt != null) ? (java.sql.Date) o.Stat_Dt.clone() : null;
    o.Start_Tm = (o.Start_Tm != null) ? (java.sql.Time) o.Start_Tm.clone() : null;
    o.End_Tm = (o.End_Tm != null) ? (java.sql.Time) o.End_Tm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Station_Nme", this.Station_Nme);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    __sqoop$field_map.put("Outside_Check_Queue_Num", this.Outside_Check_Queue_Num);
    __sqoop$field_map.put("Check_Queue_Mnt", this.Check_Queue_Mnt);
    __sqoop$field_map.put("Opr_Pty_ID", this.Opr_Pty_ID);
    __sqoop$field_map.put("Period_Type_Ind", this.Period_Type_Ind);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Stat_Dt", this.Stat_Dt);
    __sqoop$field_map.put("Station_Nme", this.Station_Nme);
    __sqoop$field_map.put("Start_Tm", this.Start_Tm);
    __sqoop$field_map.put("End_Tm", this.End_Tm);
    __sqoop$field_map.put("Outside_Check_Queue_Num", this.Outside_Check_Queue_Num);
    __sqoop$field_map.put("Check_Queue_Mnt", this.Check_Queue_Mnt);
    __sqoop$field_map.put("Opr_Pty_ID", this.Opr_Pty_ID);
    __sqoop$field_map.put("Period_Type_Ind", this.Period_Type_Ind);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
