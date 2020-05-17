package cate.pogo;

public class population {
	private String year ;
	public population(String year, String beijing, String tianjing, String hebei, String shanxi1, String neimenggu,
			String liaolin, String jilin, String heilongjiang, String shanghai, String jiangsu, String zhejiang,
			String anhui, String fujian, String jiangxi, String shandong, String henan, String hubei, String hunan,
			String guangdong, String guangxi, String hainan, String chongqign, String sichuan, String guizhou,
			String yunnan, String xizang, String sanxi2, String gansu, String qinghai, String ningxia,
			String xinjiang) {
		super();
		this.year = year;
		this.beijing = beijing;
		this.tianjing = tianjing;
		this.hebei = hebei;
		this.shanxi1 = shanxi1;
		this.neimenggu = neimenggu;
		this.liaolin = liaolin;
		this.jilin = jilin;
		this.heilongjiang = heilongjiang;
		this.shanghai = shanghai;
		this.jiangsu = jiangsu;
		this.zhejiang = zhejiang;
		this.anhui = anhui;
		this.fujian = fujian;
		this.jiangxi = jiangxi;
		this.shandong = shandong;
		this.henan = henan;
		this.hubei = hubei;
		this.hunan = hunan;
		this.guangdong = guangdong;
		this.guangxi = guangxi;
		this.hainan = hainan;
		this.chongqign = chongqign;
		this.sichuan = sichuan;
		this.guizhou = guizhou;
		this.yunnan = yunnan;
		this.xizang = xizang;
		this.sanxi2 = sanxi2;
		this.gansu = gansu;
		this.qinghai = qinghai;
		this.ningxia = ningxia;
		this.xinjiang = xinjiang;
	}
	public population() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anhui == null) ? 0 : anhui.hashCode());
		result = prime * result + ((beijing == null) ? 0 : beijing.hashCode());
		result = prime * result + ((chongqign == null) ? 0 : chongqign.hashCode());
		result = prime * result + ((fujian == null) ? 0 : fujian.hashCode());
		result = prime * result + ((gansu == null) ? 0 : gansu.hashCode());
		result = prime * result + ((guangdong == null) ? 0 : guangdong.hashCode());
		result = prime * result + ((guangxi == null) ? 0 : guangxi.hashCode());
		result = prime * result + ((guizhou == null) ? 0 : guizhou.hashCode());
		result = prime * result + ((hainan == null) ? 0 : hainan.hashCode());
		result = prime * result + ((hebei == null) ? 0 : hebei.hashCode());
		result = prime * result + ((heilongjiang == null) ? 0 : heilongjiang.hashCode());
		result = prime * result + ((henan == null) ? 0 : henan.hashCode());
		result = prime * result + ((hubei == null) ? 0 : hubei.hashCode());
		result = prime * result + ((hunan == null) ? 0 : hunan.hashCode());
		result = prime * result + ((jiangsu == null) ? 0 : jiangsu.hashCode());
		result = prime * result + ((jiangxi == null) ? 0 : jiangxi.hashCode());
		result = prime * result + ((jilin == null) ? 0 : jilin.hashCode());
		result = prime * result + ((liaolin == null) ? 0 : liaolin.hashCode());
		result = prime * result + ((neimenggu == null) ? 0 : neimenggu.hashCode());
		result = prime * result + ((ningxia == null) ? 0 : ningxia.hashCode());
		result = prime * result + ((qinghai == null) ? 0 : qinghai.hashCode());
		result = prime * result + ((sanxi2 == null) ? 0 : sanxi2.hashCode());
		result = prime * result + ((shandong == null) ? 0 : shandong.hashCode());
		result = prime * result + ((shanghai == null) ? 0 : shanghai.hashCode());
		result = prime * result + ((shanxi1 == null) ? 0 : shanxi1.hashCode());
		result = prime * result + ((sichuan == null) ? 0 : sichuan.hashCode());
		result = prime * result + ((tianjing == null) ? 0 : tianjing.hashCode());
		result = prime * result + ((xinjiang == null) ? 0 : xinjiang.hashCode());
		result = prime * result + ((xizang == null) ? 0 : xizang.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		result = prime * result + ((yunnan == null) ? 0 : yunnan.hashCode());
		result = prime * result + ((zhejiang == null) ? 0 : zhejiang.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		population other = (population) obj;
		if (anhui == null) {
			if (other.anhui != null)
				return false;
		} else if (!anhui.equals(other.anhui))
			return false;
		if (beijing == null) {
			if (other.beijing != null)
				return false;
		} else if (!beijing.equals(other.beijing))
			return false;
		if (chongqign == null) {
			if (other.chongqign != null)
				return false;
		} else if (!chongqign.equals(other.chongqign))
			return false;
		if (fujian == null) {
			if (other.fujian != null)
				return false;
		} else if (!fujian.equals(other.fujian))
			return false;
		if (gansu == null) {
			if (other.gansu != null)
				return false;
		} else if (!gansu.equals(other.gansu))
			return false;
		if (guangdong == null) {
			if (other.guangdong != null)
				return false;
		} else if (!guangdong.equals(other.guangdong))
			return false;
		if (guangxi == null) {
			if (other.guangxi != null)
				return false;
		} else if (!guangxi.equals(other.guangxi))
			return false;
		if (guizhou == null) {
			if (other.guizhou != null)
				return false;
		} else if (!guizhou.equals(other.guizhou))
			return false;
		if (hainan == null) {
			if (other.hainan != null)
				return false;
		} else if (!hainan.equals(other.hainan))
			return false;
		if (hebei == null) {
			if (other.hebei != null)
				return false;
		} else if (!hebei.equals(other.hebei))
			return false;
		if (heilongjiang == null) {
			if (other.heilongjiang != null)
				return false;
		} else if (!heilongjiang.equals(other.heilongjiang))
			return false;
		if (henan == null) {
			if (other.henan != null)
				return false;
		} else if (!henan.equals(other.henan))
			return false;
		if (hubei == null) {
			if (other.hubei != null)
				return false;
		} else if (!hubei.equals(other.hubei))
			return false;
		if (hunan == null) {
			if (other.hunan != null)
				return false;
		} else if (!hunan.equals(other.hunan))
			return false;
		if (jiangsu == null) {
			if (other.jiangsu != null)
				return false;
		} else if (!jiangsu.equals(other.jiangsu))
			return false;
		if (jiangxi == null) {
			if (other.jiangxi != null)
				return false;
		} else if (!jiangxi.equals(other.jiangxi))
			return false;
		if (jilin == null) {
			if (other.jilin != null)
				return false;
		} else if (!jilin.equals(other.jilin))
			return false;
		if (liaolin == null) {
			if (other.liaolin != null)
				return false;
		} else if (!liaolin.equals(other.liaolin))
			return false;
		if (neimenggu == null) {
			if (other.neimenggu != null)
				return false;
		} else if (!neimenggu.equals(other.neimenggu))
			return false;
		if (ningxia == null) {
			if (other.ningxia != null)
				return false;
		} else if (!ningxia.equals(other.ningxia))
			return false;
		if (qinghai == null) {
			if (other.qinghai != null)
				return false;
		} else if (!qinghai.equals(other.qinghai))
			return false;
		if (sanxi2 == null) {
			if (other.sanxi2 != null)
				return false;
		} else if (!sanxi2.equals(other.sanxi2))
			return false;
		if (shandong == null) {
			if (other.shandong != null)
				return false;
		} else if (!shandong.equals(other.shandong))
			return false;
		if (shanghai == null) {
			if (other.shanghai != null)
				return false;
		} else if (!shanghai.equals(other.shanghai))
			return false;
		if (shanxi1 == null) {
			if (other.shanxi1 != null)
				return false;
		} else if (!shanxi1.equals(other.shanxi1))
			return false;
		if (sichuan == null) {
			if (other.sichuan != null)
				return false;
		} else if (!sichuan.equals(other.sichuan))
			return false;
		if (tianjing == null) {
			if (other.tianjing != null)
				return false;
		} else if (!tianjing.equals(other.tianjing))
			return false;
		if (xinjiang == null) {
			if (other.xinjiang != null)
				return false;
		} else if (!xinjiang.equals(other.xinjiang))
			return false;
		if (xizang == null) {
			if (other.xizang != null)
				return false;
		} else if (!xizang.equals(other.xizang))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		if (yunnan == null) {
			if (other.yunnan != null)
				return false;
		} else if (!yunnan.equals(other.yunnan))
			return false;
		if (zhejiang == null) {
			if (other.zhejiang != null)
				return false;
		} else if (!zhejiang.equals(other.zhejiang))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "population [year=" + year + ", beijing=" + beijing + ", tianjing=" + tianjing + ", hebei=" + hebei
				+ ", shanxi1=" + shanxi1 + ", neimenggu=" + neimenggu + ", liaolin=" + liaolin + ", jilin=" + jilin
				+ ", heilongjiang=" + heilongjiang + ", shanghai=" + shanghai + ", jiangsu=" + jiangsu + ", zhejiang="
				+ zhejiang + ", anhui=" + anhui + ", fujian=" + fujian + ", jiangxi=" + jiangxi + ", shandong="
				+ shandong + ", henan=" + henan + ", hubei=" + hubei + ", hunan=" + hunan + ", guangdong=" + guangdong
				+ ", guangxi=" + guangxi + ", hainan=" + hainan + ", chongqign=" + chongqign + ", sichuan=" + sichuan
				+ ", guizhou=" + guizhou + ", yunnan=" + yunnan + ", xizang=" + xizang + ", sanxi2=" + sanxi2
				+ ", gansu=" + gansu + ", qinghai=" + qinghai + ", ningxia=" + ningxia + ", xinjiang=" + xinjiang + "]";
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the beijing
	 */
	public String getBeijing() {
		return beijing;
	}
	/**
	 * @param beijing the beijing to set
	 */
	public void setBeijing(String beijing) {
		this.beijing = beijing;
	}
	/**
	 * @return the tianjing
	 */
	public String getTianjing() {
		return tianjing;
	}
	/**
	 * @param tianjing the tianjing to set
	 */
	public void setTianjing(String tianjing) {
		this.tianjing = tianjing;
	}
	/**
	 * @return the hebei
	 */
	public String getHebei() {
		return hebei;
	}
	/**
	 * @param hebei the hebei to set
	 */
	public void setHebei(String hebei) {
		this.hebei = hebei;
	}
	/**
	 * @return the shanxi1
	 */
	public String getShanxi1() {
		return shanxi1;
	}
	/**
	 * @param shanxi1 the shanxi1 to set
	 */
	public void setShanxi1(String shanxi1) {
		this.shanxi1 = shanxi1;
	}
	/**
	 * @return the neimenggu
	 */
	public String getNeimenggu() {
		return neimenggu;
	}
	/**
	 * @param neimenggu the neimenggu to set
	 */
	public void setNeimenggu(String neimenggu) {
		this.neimenggu = neimenggu;
	}
	/**
	 * @return the liaolin
	 */
	public String getLiaolin() {
		return liaolin;
	}
	/**
	 * @param liaolin the liaolin to set
	 */
	public void setLiaolin(String liaolin) {
		this.liaolin = liaolin;
	}
	/**
	 * @return the jilin
	 */
	public String getJilin() {
		return jilin;
	}
	/**
	 * @param jilin the jilin to set
	 */
	public void setJilin(String jilin) {
		this.jilin = jilin;
	}
	/**
	 * @return the heilongjiang
	 */
	public String getHeilongjiang() {
		return heilongjiang;
	}
	/**
	 * @param heilongjiang the heilongjiang to set
	 */
	public void setHeilongjiang(String heilongjiang) {
		this.heilongjiang = heilongjiang;
	}
	/**
	 * @return the shanghai
	 */
	public String getShanghai() {
		return shanghai;
	}
	/**
	 * @param shanghai the shanghai to set
	 */
	public void setShanghai(String shanghai) {
		this.shanghai = shanghai;
	}
	/**
	 * @return the jiangsu
	 */
	public String getJiangsu() {
		return jiangsu;
	}
	/**
	 * @param jiangsu the jiangsu to set
	 */
	public void setJiangsu(String jiangsu) {
		this.jiangsu = jiangsu;
	}
	/**
	 * @return the zhejiang
	 */
	public String getZhejiang() {
		return zhejiang;
	}
	/**
	 * @param zhejiang the zhejiang to set
	 */
	public void setZhejiang(String zhejiang) {
		this.zhejiang = zhejiang;
	}
	/**
	 * @return the anhui
	 */
	public String getAnhui() {
		return anhui;
	}
	/**
	 * @param anhui the anhui to set
	 */
	public void setAnhui(String anhui) {
		this.anhui = anhui;
	}
	/**
	 * @return the fujian
	 */
	public String getFujian() {
		return fujian;
	}
	/**
	 * @param fujian the fujian to set
	 */
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	/**
	 * @return the jiangxi
	 */
	public String getJiangxi() {
		return jiangxi;
	}
	/**
	 * @param jiangxi the jiangxi to set
	 */
	public void setJiangxi(String jiangxi) {
		this.jiangxi = jiangxi;
	}
	/**
	 * @return the shandong
	 */
	public String getShandong() {
		return shandong;
	}
	/**
	 * @param shandong the shandong to set
	 */
	public void setShandong(String shandong) {
		this.shandong = shandong;
	}
	/**
	 * @return the henan
	 */
	public String getHenan() {
		return henan;
	}
	/**
	 * @param henan the henan to set
	 */
	public void setHenan(String henan) {
		this.henan = henan;
	}
	/**
	 * @return the hubei
	 */
	public String getHubei() {
		return hubei;
	}
	/**
	 * @param hubei the hubei to set
	 */
	public void setHubei(String hubei) {
		this.hubei = hubei;
	}
	/**
	 * @return the hunan
	 */
	public String getHunan() {
		return hunan;
	}
	/**
	 * @param hunan the hunan to set
	 */
	public void setHunan(String hunan) {
		this.hunan = hunan;
	}
	/**
	 * @return the guangdong
	 */
	public String getGuangdong() {
		return guangdong;
	}
	/**
	 * @param guangdong the guangdong to set
	 */
	public void setGuangdong(String guangdong) {
		this.guangdong = guangdong;
	}
	/**
	 * @return the guangxi
	 */
	public String getGuangxi() {
		return guangxi;
	}
	/**
	 * @param guangxi the guangxi to set
	 */
	public void setGuangxi(String guangxi) {
		this.guangxi = guangxi;
	}
	/**
	 * @return the hainan
	 */
	public String getHainan() {
		return hainan;
	}
	/**
	 * @param hainan the hainan to set
	 */
	public void setHainan(String hainan) {
		this.hainan = hainan;
	}
	/**
	 * @return the chongqign
	 */
	public String getChongqign() {
		return chongqign;
	}
	/**
	 * @param chongqign the chongqign to set
	 */
	public void setChongqign(String chongqign) {
		this.chongqign = chongqign;
	}
	/**
	 * @return the sichuan
	 */
	public String getSichuan() {
		return sichuan;
	}
	/**
	 * @param sichuan the sichuan to set
	 */
	public void setSichuan(String sichuan) {
		this.sichuan = sichuan;
	}
	/**
	 * @return the guizhou
	 */
	public String getGuizhou() {
		return guizhou;
	}
	/**
	 * @param guizhou the guizhou to set
	 */
	public void setGuizhou(String guizhou) {
		this.guizhou = guizhou;
	}
	/**
	 * @return the yunnan
	 */
	public String getYunnan() {
		return yunnan;
	}
	/**
	 * @param yunnan the yunnan to set
	 */
	public void setYunnan(String yunnan) {
		this.yunnan = yunnan;
	}
	/**
	 * @return the xizang
	 */
	public String getXizang() {
		return xizang;
	}
	/**
	 * @param xizang the xizang to set
	 */
	public void setXizang(String xizang) {
		this.xizang = xizang;
	}
	/**
	 * @return the sanxi2
	 */
	public String getSanxi2() {
		return sanxi2;
	}
	/**
	 * @param sanxi2 the sanxi2 to set
	 */
	public void setSanxi2(String sanxi2) {
		this.sanxi2 = sanxi2;
	}
	/**
	 * @return the gansu
	 */
	public String getGansu() {
		return gansu;
	}
	/**
	 * @param gansu the gansu to set
	 */
	public void setGansu(String gansu) {
		this.gansu = gansu;
	}
	/**
	 * @return the qinghai
	 */
	public String getQinghai() {
		return qinghai;
	}
	/**
	 * @param qinghai the qinghai to set
	 */
	public void setQinghai(String qinghai) {
		this.qinghai = qinghai;
	}
	/**
	 * @return the ningxia
	 */
	public String getNingxia() {
		return ningxia;
	}
	/**
	 * @param ningxia the ningxia to set
	 */
	public void setNingxia(String ningxia) {
		this.ningxia = ningxia;
	}
	/**
	 * @return the xinjiang
	 */
	public String getXinjiang() {
		return xinjiang;
	}
	/**
	 * @param xinjiang the xinjiang to set
	 */
	public void setXinjiang(String xinjiang) {
		this.xinjiang = xinjiang;
	}
	private String beijing;
	private String tianjing;
	private String hebei;
	private String shanxi1;
	private String neimenggu;
	private String liaolin;
	private String jilin;
	private String heilongjiang;
	private String shanghai;
	private String jiangsu;
	private String zhejiang;
	private String anhui;
	private String fujian;
	private String jiangxi;
	private String shandong;
	private String henan;
	private String hubei;
	private String hunan;
	private String guangdong;
	private String guangxi;
	private String hainan;
	private String chongqign;
	private String sichuan;
	private String guizhou;
	private String yunnan;
	private String xizang;
	private String sanxi2;
	private String gansu;
	private String qinghai;
	private String ningxia;
	private String xinjiang;

}
